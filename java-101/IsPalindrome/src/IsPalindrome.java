import java.util.Scanner;

public class IsPalindrome {
    public static void findPalindrome(){
        int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Palindrom kontrolü yapılacak sayıyı giriniz : ");
        number = input.nextInt();
        System.out.println(isNumberPalindrome(number));
    }
    public static boolean isNumberPalindrome(int num){
        String s = String.valueOf(num);
        String str = "";
        for(int i=s.length()-1;i>=0;i--){
            str+=s.charAt(i);
        }
        if(str.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}
