import java.util.Scanner;

public class FlightTicketPriceCalculation {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate() {
        Scanner input = new Scanner(System.in);
        int km;
        double perKm = 0.1;
        int age;
        int tripType;
        double totalAmount;

        System.out.println("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz : ");
        age = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tripType = input.nextInt();

        totalAmount = km * perKm;

        if (age < 12) {
            totalAmount *= 0.5;
        } else if (age >= 12 && age < 24) {
            totalAmount *= 0.9;
        } else if (age > 65) {
            totalAmount *= 0.7;
        }

        if (tripType == 2) {
            totalAmount *= 1.6;
        }

        if (km < 0 || age < 0 || tripType < 1 || tripType > 2) {
            System.out.println("Hatalı Veri Girdiniz !");
        } else {
            System.out.println("Toplam Tutar = " + totalAmount);
        }


    }
}
