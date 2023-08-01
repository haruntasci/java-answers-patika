import java.util.Scanner;

public class LoopsAverage {
    public static void calculate(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz");
        int number = scanner.nextInt();
        int sum = 0;
        int numberCount = 0;
        for(int i=0;i<=number;i++){
            if(i%3==0 || i%4==0){
                sum+=i;
                numberCount++;
            }
        }
        System.out.println("Sayıların ortalaması: "+(sum/(numberCount-1)));
    }
}
