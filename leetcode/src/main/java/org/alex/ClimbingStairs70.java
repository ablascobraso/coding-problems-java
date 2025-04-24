public class ClimbingStairs70 {
    public static int climbingStairs(int n) {
        if(n <= 3){
            return n;
        }
        int before2 = 2;
        int before1 = 3;
        int result = -1;

        for (int i=3; i<n; i++){
            result = before2 + before1;
            before2 = before1;
            before1 = result;
        }
        return result;
    }

    public static void main(String[] args) {
        int result = climbingStairs(5);
        System.out.println(result);
    }
}
