import java.util.Scanner;

public class Taximeter {
    public static void calculate() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Gidilecek mesafeyi KM olarak giriniz : ");
        int distanceKM = scanner.nextInt();
        int taxiOpening = 10;
        double taxiMultiplier = 2.2;
        double totalAmount = taxiOpening + distanceKM * taxiMultiplier;

        totalAmount = totalAmount < 20 ? 20 : totalAmount;
        System.out.println("Ödenecek tutar : " + totalAmount);

    }
}
