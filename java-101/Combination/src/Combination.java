import java.util.Scanner;

public class Combination {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("n sayısını giriniz");
        int n = scanner.nextInt();
        System.out.println("r sayısını giriniz");
        int r = scanner.nextInt();
        int result;

        result = fact(n) / (fact(r) * fact(n-r));
        System.out.println("Kombinasyon sonucu: " + result);

    }
    static int fact(int number) {
        int f = 1;
        int j = 1;
        while(j <= number) {
            f = f * j;
            j++;
        }
        return f;
    }
}
