public class LengthofLastWord58 {

    public static int lengthOfLastWord(String s) {
        int i = s.length()-1;
        while (s.charAt(i) == ' '){
            i--;
        }
        int j = i;
        while (j >= 0 && s.charAt(j) != ' '){
            j--;
        }
        return i-j;
    }

    public static void main(String[] args) {

        String s = "a";

        System.out.println("Output:" + lengthOfLastWord(s));
    }
}
