public class Sqrtx69 {
    public static int sqrtx(int x) {
        long left = 0;
        long right = (x / 2) + 1;

        while(left < right){
            long mid = left + (right - left) / 2;
            long sqrt = mid * mid;

            if (sqrt == x){
                return (int) sqrt;
            }
            else if (sqrt < x){
                left = mid;
            }
            else {
                right = mid - 1;
            }
        }
        return (int) left;
    }

    public static void main(String[] args) {
        int i = sqrtx(8);
        System.out.println(i);
    }
}
