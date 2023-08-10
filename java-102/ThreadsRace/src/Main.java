import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int totalNumbers = 10000;
        int partitionSize = totalNumbers / 4;

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= totalNumbers; i++) {
            numbers.add(i);
        }

        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        List<Thread> threads = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            final int start = i * partitionSize;
            final int end = (i + 1) * partitionSize;

            Thread thread = new Thread(() -> {
                for (int num = start; num < end; num++) {
                    if (num % 2 == 0) {
                        synchronized (evenNumbers) {
                            evenNumbers.add(num);
                        }
                    } else {
                        synchronized (oddNumbers) {
                            oddNumbers.add(num);
                        }
                    }
                }
            });

            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
    }
}