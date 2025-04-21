import java.util.HashSet;
import java.util.Set;

public class HappyNumber202 {

    public static boolean isHappy(int n) {
        int result = n;
        Set<Integer> alreadySeen = new HashSet<>();

        while (result != 1) {
            result = 0;
            while (n > 0) {
                int digit = n % 10;
                result = result + digit * digit;
                n /= 10;
            }
            if (alreadySeen.contains(result)) {
                return false;
            } else {
                alreadySeen.add(result);
            }
            n = result;
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}

