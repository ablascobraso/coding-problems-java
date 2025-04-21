public class NumberOfOneBits191 {

    public static int hammingWeight(int n) {
        String binaryString = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        char[] charArray = binaryString.toCharArray();
        int result = 0;
        for (char c : charArray) {
            if (c == '1') {
                result++;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println(hammingWeight(11));
    }
}

