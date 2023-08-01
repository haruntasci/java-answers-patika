import java.util.Scanner;


public class CalculatingKDV {
    public static void calculateKDV() {

        double paraDegeri;
        double tutar;
        double KDVlitutar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Para değerini giriniz : ");
        paraDegeri = scanner.nextDouble();
        tutar = (paraDegeri * 1.18 - paraDegeri);
        tutar = Math.ceil(tutar * 100) / 100;
        KDVlitutar = (paraDegeri * 1.18);
        KDVlitutar = Math.ceil(KDVlitutar * 100) / 100;
        System.out.println("KDV'siz Fiyat = " + paraDegeri + " TL");
        System.out.println("KDV'li Fiyat = " + KDVlitutar + " TL");
        System.out.println("KDV Tutarı = " + tutar + " TL");
    }
}
