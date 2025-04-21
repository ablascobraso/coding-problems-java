import java.util.Arrays;

public class PlusOne66 {

    public static int[] plusOne(int[] digits) {
        int i = digits.length -1;
        while(true){
            if(digits[i] != 9){
                digits[i] = digits[i]+1;
                return digits;
            }
            else{
                digits[i] = 0;
                if(i==0){
                    int[] newArray = new int[digits.length + 1];
                    newArray[0] = 1;
                    return newArray;
                }
                else{
                    i--;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] digit = new int[3];
        digit[0] = 1;
        digit[1] = 2;
        digit[2] = 3;

        System.out.println("Plus one:" + Arrays.toString(plusOne(digit)));
    }
}
