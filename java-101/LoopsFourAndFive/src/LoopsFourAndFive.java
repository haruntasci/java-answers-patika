import java.util.Scanner;

public class LoopsFourAndFive {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int enteredNumber = scanner.nextInt();
        for (int i = 1; i <= enteredNumber; i++) {
            if (i % 5 == 0) {
                int number1 = 1;
                int count1 = 0;
                while (number1 != i) {
                    number1 *= 5;
                    count1++;
                    if (number1 > i) {
                        count1 = 0;
                        break;
                    }
                }
                if (count1 != 0) {
                    System.out.println("5 ^ " + count1);
                }

            }
            if (i % 4 == 0) {
                int number2 = 1;
                int count2 = 0;
                while (number2 != i) {
                    number2 *= 4;
                    count2++;
                    if (number2 > i) {
                        count2 = 0;
                        break;
                    }
                }
                if (count2 != 0) {
                    System.out.println("4 ^ " + count2);
                }

            }

        }
    }
}
