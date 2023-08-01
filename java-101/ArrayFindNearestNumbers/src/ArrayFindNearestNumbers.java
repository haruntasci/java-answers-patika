public class ArrayFindNearestNumbers {
    public static void main(String[] args) {
        find();
    }

    public static void find() {
        int[] arr = {15, 12, 788, 1, -1, -778, 2, 0};
        int enteredNumber = 5;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k] < enteredNumber && arr[k + 1] > enteredNumber) {
                System.out.println("Girilen sayıdan küçük en yakın sayı :" + arr[k]);
                System.out.println("Girilen sayıdan büyük en yakın sayı :" + arr[k + 1]);
                break;
            }
        }

    }
}
