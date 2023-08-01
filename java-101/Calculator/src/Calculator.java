import java.util.Scanner;

public class Calculator {

    public static void calculate() {

        int n1, n2, select;

        Scanner input = new Scanner(System.in);
        System.out.println("İlk Sayıyı Giriniz : ");
        n1 = input.nextInt();
        System.out.println("İkinci Sayıyı Giriniz : ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.println("Seçiminiz : ");
        select = input.nextInt();

        switch (select) {
            case 1:
                System.out.println("Toplama : " + (n1 + n2));
                break;
            case 2:
                System.out.println("Çıkarma : " + (n1 - n2));
                break;
            case 3:
                System.out.println("Çarpma : " + (n1 * n2));
                break;
            case 4:
                System.out.println(n2 != 0 ? "Bölme : " + (n1 / n2) : "0'a bölme işlemi yapamazsınız.");
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;
        }

    }

}
