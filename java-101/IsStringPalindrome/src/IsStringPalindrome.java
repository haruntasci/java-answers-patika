public class IsStringPalindrome {
    private static boolean isPalindrome(String str) {
        String palindrome = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            palindrome += str.charAt(i);
        }
        if (palindrome.equals(str)) {
            return true;
        }
        return false;
    }

    public static void find() {
        System.out.println(isPalindrome("abba"));
    }
}
