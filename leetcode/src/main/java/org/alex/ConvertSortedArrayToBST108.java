import commondatastructures.TreeNode;

public class ConvertSortedArrayToBST108 {
    public static TreeNode convertSortedArrayToBST108(int[] nums) {
        if (nums.length == 0){
            return null;
        }
        return helperConvertArrayToBST(nums, 0, nums.length-1);
    }

    private static TreeNode helperConvertArrayToBST(int[] nums, int left, int right) {
        if(left > right) return null;
        int middle = left + (right - left) / 2;
        TreeNode node = new TreeNode(nums[middle]);
        node.left = helperConvertArrayToBST(nums, left, middle-1);
        node.right = helperConvertArrayToBST(nums, middle + 1, right);
        return node;
    }


    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = -10;
        nums[1] = -3;
        nums[2] = 0;
        nums[3] = 5;
        nums[4] = 9;


        System.out.println(convertSortedArrayToBST108(nums));
    }
}
