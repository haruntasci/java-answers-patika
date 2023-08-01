import java.util.Scanner;

public class ChineseZodiac {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate() {

        int year;
        String[] animals = {"Maymun", "Horoz", "Köpek", "Domuz", "Fare", "Öküz", "Kaplan", "Tavşan", "Ejderha", "Yılan", "At", "Koyun"};
        Scanner input = new Scanner(System.in);
        System.out.println("Doğum Yılınızı Giriniz : ");
        year = input.nextInt();
        System.out.println("Çin Zodyağı Burcunuz : " + animals[year % 12]);

    }
}
