import java.util.Scanner;

public class CalculatingGradePointAverage {
    public static void calculate() {

        Scanner input = new Scanner(System.in);

        int mat, fizik, kimya, turkce, tarih, muzik;
        int toplam;
        double sonuc;

        System.out.println("Matematik notunuzu giriniz : ");
        mat = input.nextInt();

        System.out.println("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.println("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.println("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.println("Tarih notunuzu giriniz : ");
        tarih = input.nextInt();

        System.out.println("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        sonuc = toplam / 6;

        System.out.println("Ortalama : " + sonuc);
        System.out.println(sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");

    }
}
