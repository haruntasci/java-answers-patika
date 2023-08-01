import java.util.Scanner;

public class HarmonicSeriesCalculator {
    public static void calculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int number = input.nextInt();
        double sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += (double) 1 / i;
        }
        System.out.println(number + " sayısının harmonik hesabı: " + sum);
    }
}
