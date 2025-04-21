public class ReverseBits190 {

    public static int reverseBits(int n) {
        String binaryString = String.format("%32s", Integer.toBinaryString(n)).replace(' ', '0');
        String reversed = new StringBuilder(binaryString).reverse().toString();
        return (int) Long.parseLong(reversed, 2);
    }


    public static void main(String[] args) {
        System.out.println(reverseBits(43261596));
    }
}

