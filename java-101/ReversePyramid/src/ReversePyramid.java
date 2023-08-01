import java.util.Scanner;

public class ReversePyramid {
    public static void main(String[] args) {
        draw();
    }
    public static void draw() {
        int digits;
        Scanner input = new Scanner(System.in);
        System.out.println("Basamak sayısını giriniz : ");
        digits = input.nextInt();

        for (int i = 0; i < digits; i++) {
            for (int j = digits - i; j < digits; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * (digits - i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
