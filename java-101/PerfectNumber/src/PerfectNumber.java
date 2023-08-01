import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        findPerfectNumber();
    }

    public static void findPerfectNumber() {
        int number;
        int checkIfPerfect = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        number = scanner.nextInt();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                checkIfPerfect += i;
            }
        }
        System.out.println(number == checkIfPerfect ? number + " Mükemmel sayıdır." : number + " Mükemmel sayı değildir.");
    }
}
