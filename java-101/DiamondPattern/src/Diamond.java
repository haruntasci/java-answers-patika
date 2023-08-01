import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        draw();
    }

    public static void draw() {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir Sayı Giriniz :");
        int n = klavye.nextInt();

        for (int i = 0; i < n; i++) {

            for (int k = 0; k < n - 1 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int k = i * 2 + 1; k < 2 * n - 2; k++) {
                System.out.print("*");
            }


            System.out.println();
        }

    }
}
