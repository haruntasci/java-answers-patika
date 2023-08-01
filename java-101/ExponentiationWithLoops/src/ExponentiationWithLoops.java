import java.util.Scanner;

public class ExponentiationWithLoops {
    public static void calculate() {
        int base;
        int pow;
        int total = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Üssü alınacak sayı : ");
        base = scanner.nextInt();
        System.out.println("Üs olacak sayı : ");
        pow = scanner.nextInt();

        for (int i = 0; i < pow; i++) {
            total *= base;
        }
        System.out.println("Sonuç : " + total);

    }
}
