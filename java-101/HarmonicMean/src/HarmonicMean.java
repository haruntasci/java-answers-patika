public class HarmonicMean {
    public static void bul() {
        int[] numbers = {1, 2, 3, 4, 5};
        double harmonicMean = 0;
        double sum = 0;
        int harmonic = 0;
        for (int number : numbers) {
            sum += (double) 1 / number;
        }
        harmonicMean = numbers.length / sum;
        System.out.println("Dizinin harmonik ortalaması :" + harmonicMean);
    }
}
