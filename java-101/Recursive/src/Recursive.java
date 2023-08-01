import java.util.Scanner;

public class Recursive {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate() {
        int taban;
        int us;
        int result;
        Scanner input = new Scanner(System.in);
        System.out.println("Taban değeri giriniz : ");
        taban = input.nextInt();
        System.out.println("Üs değeri giriniz : ");
        us = input.nextInt();

        result = recursive(taban, us);
        System.out.println("Sonuç : " + result);
    }

    static int recursive(int base, int pow) {
        if (pow != 0) {
            return (base * recursive(base, pow - 1));
        } else {
            return 1;
        }
    }

}
