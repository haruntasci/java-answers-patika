import java.util.ArrayList;

public class Frequency {
    public static void main(String[] args) {
        findFrequency();
    }

    public static void findFrequency() {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20};
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        for (int k = 0; k < numbers.length - 1; k++) {
            if (numbers[k] == numbers[k + 1]) {
                count++;
            } else {
                System.out.println(numbers[k] + " sayısı " + (count + 1) + " kere tekrar edildi.");
                count = 0;
            }
            if (k == numbers.length - 2) {
                System.out.println(numbers[k] + " sayısı " + (count + 1) + " kere tekrar edildi.");
            }
        }


    }
}
