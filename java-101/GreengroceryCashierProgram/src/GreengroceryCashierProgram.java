import java.util.Scanner;

public class GreengroceryCashierProgram {
    public static void main(String[] args) {
        calculateTotal();
    }

    public static void calculateTotal() {
        float pear = 2.14f;
        float apple = 3.67f;
        float tomatoes = 1.11f;
        float banana = 0.95f;
        float eggplant = 5f;
        float totalAmount = 0;
        int pearKg;
        int appleKg;
        int tomatoesKg;
        int bananaKg;
        int eggplantKg;

        Scanner input = new Scanner(System.in);
        System.out.println("Armut Kaç Kilo ?");
        pearKg = input.nextInt();
        System.out.println("Elma Kaç Kilo ?");
        appleKg = input.nextInt();
        System.out.println("Domates Kaç Kilo ?");
        tomatoesKg = input.nextInt();
        System.out.println("Muz Kaç Kilo ?");
        bananaKg = input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ?");
        eggplantKg = input.nextInt();

        totalAmount = pearKg * pear + appleKg * apple + tomatoesKg * tomatoes + bananaKg * banana + eggplantKg * eggplant;

        System.out.printf("Toplam Tutar : %.2f", totalAmount);


    }
}
