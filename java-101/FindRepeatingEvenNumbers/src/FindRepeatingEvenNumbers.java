import java.util.Arrays;

public class FindRepeatingEvenNumbers {
    public static void find() {
        int[] arr = {1, 5, 12, 7, 11, 4, 8, 4, 2, 8, 5, 1, 6, 4, 6, 12, 11};
        int number = 0;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                number = arr[i];
            } else {
                if (arr[i] % 2 == 0) {
                    System.out.print(arr[i] + " ");
                }
            }
        }
        if (number % 2 == 0) {
            System.out.print(number);
        }

    }
}
