package org.example;

import java.util.Scanner;

public class SumOfDigits {
    public static void calculateSumOfDigitsOfANumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int sum = 0;
        String digitsNumber = String.valueOf(number);
        for (int i = 0; i < digitsNumber.length(); i++) {
            sum += Character.getNumericValue(digitsNumber.charAt(i));
        }
        System.out.println("Toplam: " + sum);


    }
}
