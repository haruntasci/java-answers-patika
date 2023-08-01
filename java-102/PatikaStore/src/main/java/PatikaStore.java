import java.util.*;

public class PatikaStore {

    static List<String> brands = Arrays.asList(
            "Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"
    );

    static List<Product> products = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri");
            System.out.println("2 - Cep Telefonu İşlemleri");
            System.out.println("3 - Marka Listele");
            System.out.println("0 - Çıkış Yap");
            System.out.print("Tercihiniz: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    manageNotebooks(scanner);
                    break;
                case 2:
                    managePhones(scanner);
                    break;
                case 3:
                    listBrands();
                    break;
                case 0:
                    System.out.println("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz tercih!");
                    break;
            }

        } while (choice != 0);

        scanner.close();
    }

    static void manageNotebooks(Scanner scanner) {
        int choice;
        do {
            System.out.println("Notebook İşlemleri");
            System.out.println("1 - Notebook Listele");
            System.out.println("2 - Notebook Ekle");
            System.out.println("3 - Notebook Sil");
            System.out.println("0 - Ana Menüye Dön");
            System.out.print("Tercihiniz: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listProducts("Notebook");
                    break;
                case 2:
                    addProduct(scanner, "Notebook");
                    break;
                case 3:
                    removeProduct(scanner, "Notebook");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Geçersiz tercih!");
                    break;
            }

        } while (choice != 0);
    }

    static void managePhones(Scanner scanner) {
        int choice;
        do {
            System.out.println("Cep Telefonu İşlemleri");
            System.out.println("1 - Cep Telefonu Listele");
            System.out.println("2 - Cep Telefonu Ekle");
            System.out.println("3 - Cep Telefonu Sil");
            System.out.println("0 - Ana Menüye Dön");
            System.out.print("Tercihiniz: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    listProducts("Cep Telefonu");
                    break;
                case 2:
                    addProduct(scanner, "Cep Telefonu");
                    break;
                case 3:
                    removeProduct(scanner, "Cep Telefonu");
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Geçersiz tercih!");
                    break;
            }

        } while (choice != 0);
    }

    static void listBrands() {
        Collections.sort(brands);
        System.out.println("Markalarımız");
        System.out.println("--------------");
        for (String brand : brands) {
            System.out.println("- " + brand);
        }
    }

    static void listProducts(String productType) {
        System.out.println(productType + " Listesi");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        System.out.println("| ID | Ürün Adı                      | Fiyat     | Marka     | Depolama  | Ekran     | RAM         |");
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
        for (Product product : products) {
            if (product.getProductType().equals(productType)) {
                System.out.format("| %2d | %-30s | %-9.2f | %-9s | %-9s | %-9s | %-12s |\n",
                        product.getId(), product.getName(), product.getPrice(), product.getBrand(),
                        product.getStorage(), product.getScreen(), product.getRam());
            }
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------");
    }

    static void addProduct(Scanner scanner, String productType) {
        Product product = new Product();

        System.out.print("Ürün Adı: ");
        scanner.nextLine(); // Consume newline left-over
        product.setName(scanner.nextLine());

        System.out.print("Fiyat: ");
        product.setPrice(scanner.nextDouble());

        System.out.print("Marka: ");
        scanner.nextLine(); // Consume newline left-over
        String brand = scanner.nextLine();
        if (!brands.contains(brand)) {
            System.out.println("Geçersiz marka! Lütfen listedeki markalardan birini girin.");
            return;
        }
        product.setBrand(brand);

        if (productType.equals("Notebook")) {
            System.out.print("Depolama: ");
            product.setStorage(scanner.nextInt());

            System.out.print("Ekran: ");
            product.setScreen(scanner.nextDouble());

            System.out.print("RAM: ");
            product.setRam(scanner.nextInt());
        } else if (productType.equals("Cep Telefonu")) {
            System.out.print("Depolama: ");
            product.setStorage(scanner.nextInt());

            System.out.print("Ekran: ");
            product.setScreen(scanner.nextDouble());

            System.out.print("Kamera: ");
            product.setCamera(scanner.nextInt());

            System.out.print("Pil: ");
            product.setBattery(scanner.nextDouble());

            System.out.print("RAM: ");
            product.setRam(scanner.nextInt());

            System.out.print("Renk: ");
            scanner.nextLine(); // Consume newline left-over
            product.setColor(scanner.nextLine());
        }

        product.setProductType(productType);
        product.setId(products.size() + 1);
        products.add(product);
        System.out.println("Ürün başarıyla eklendi!");
    }

    static void removeProduct(Scanner scanner, String productType) {
        System.out.print("Silmek istediğiniz ürünün ID'sini girin: ");
        int productId = scanner.nextInt();
        boolean found = false;
        for (Iterator<Product> iterator = products.iterator(); iterator.hasNext(); ) {
            Product product = iterator.next();
            if (product.getId() == productId && product.getProductType().equals(productType)) {
                iterator.remove();
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Ürün başarıyla silindi!");
        } else {
            System.out.println("Ürün bulunamadı!");
        }
    }
}