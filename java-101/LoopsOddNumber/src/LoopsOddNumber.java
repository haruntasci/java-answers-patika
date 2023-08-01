import java.util.Scanner;

public class LoopsOddNumber {


    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int number = 0;
        int sum = 0;
        while (flag) {
            System.out.println("Bir sayı giriniz: ");
            number = scanner.nextInt();
            if (number % 2 == 0) {
                if (number % 4 == 0) {
                    sum += number;
                }
            } else {
                flag = false;
            }
        }
        System.out.println("Toplam: " + sum);

    }
}
