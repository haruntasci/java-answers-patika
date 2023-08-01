import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        int elements;
        int firstElement = 0;
        int secondElement = 1;
        int temp = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eleman sayısını giriniz : ");
        elements = scanner.nextInt();

        for (int i = 0; i <= elements; i++) {
            System.out.print(" " + firstElement);
            temp = secondElement;
            secondElement = firstElement + secondElement;
            firstElement = temp;
        }

    }
}
