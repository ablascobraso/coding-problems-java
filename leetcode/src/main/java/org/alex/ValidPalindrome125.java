public class ValidPalindrome125 {

    public static boolean isPalindrome(String s) {
        return isPalindromeHelper(s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase());
    }

    public static boolean isPalindromeHelper(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindromeHelper(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}

