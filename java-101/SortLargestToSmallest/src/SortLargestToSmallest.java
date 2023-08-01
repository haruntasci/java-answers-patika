import java.util.Arrays;
import java.util.Scanner;

public class SortLargestToSmallest {
    public static void sort(){
        int[] sortedNumbers = new int[3];
        Scanner input = new Scanner(System.in);
        System.out.println("İlk sayıyı giriniz");
        sortedNumbers[0] = input.nextInt();
        System.out.println("İkinci sayıyı giriniz");
        sortedNumbers[1] = input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz");
        sortedNumbers[2] = input.nextInt();

        Arrays.sort(sortedNumbers);
        for(int number : sortedNumbers){
            System.out.print(number+" ");
        }


    }
}
