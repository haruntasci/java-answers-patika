import java.util.Scanner;

public class RecursivePattern {
    public static void main(String[] args) {
        calculate();
    }
    public static void calculate() {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("N Sayısı : ");
        N = input.nextInt();
        findThePattern(N,  N, false);
    }

    public static int findThePattern(int number, int limit, boolean increase) {
        int variable;
        if (number > limit && increase) {
            return 1;
        }
        if (number <= 0) {
            increase = true;
        }
        if (increase) {
            variable = 5;
        } else {
            variable = -5;
        }
        System.out.print(number + " ");
        return findThePattern(number + variable, limit, increase);
    }


}
