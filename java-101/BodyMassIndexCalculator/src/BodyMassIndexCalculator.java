import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {
        calculateBodyMass();
    }
    public static void calculateBodyMass() {

        double boy;
        double kg;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        boy = scanner.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz : ");
        kg = scanner.nextDouble();

        System.out.println("Vücut Kitle İndeksiniz : " + (kg / (Math.pow(boy, 2))));


    }
}
