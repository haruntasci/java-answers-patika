import java.util.Scanner;

public class AreaOfTheCircle {
    public static void main(String[] args) {
        calculate();
    }

    public static void calculate() {
        Scanner input = new Scanner(System.in);
        System.out.println("Yarıçapı giriniz : ");
        int radius = input.nextInt();
        System.out.println("Merkez açısının ölçüsünü giriniz : ");
        int angle = input.nextInt();
        double piNumber = 3.14;
        double result = (piNumber * (Math.pow(radius, 2)) * angle) / 360;
        System.out.println("Daire diliminin alanı : " + result);

    }
}
