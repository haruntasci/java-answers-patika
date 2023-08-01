import java.util.Scanner;

public class CalculateArea {
    public static void calculate() {
        int a, b, c;
        int perimeter;
        int u;
        int areaSquare;
        double area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Kenarı giriniz : ");
        a = scanner.nextInt();
        System.out.println("2. Kenarı giriniz : ");
        b = scanner.nextInt();
        System.out.println("3. Kenarı giriniz : ");
        c = scanner.nextInt();

        perimeter = a + b + c;
        u = perimeter / 2;
        areaSquare = u * (u - a) * (u - b) * (u - c);
        area = Math.sqrt(areaSquare);
        System.out.println("Alan = " + area);

    }
}
