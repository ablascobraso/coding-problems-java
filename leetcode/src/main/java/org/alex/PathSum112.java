import commondatastructures.TreeNode;

public class PathSum112 {
    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        boolean leftSum = hasPathSum(root.left, targetSum - root.val);
        boolean rightSum = hasPathSum(root.right, targetSum - root.val);

        return leftSum || rightSum;
    }


    public static void main(String[] args) {
        TreeNode t9 = new TreeNode(1);
        TreeNode t8 = new TreeNode(4, null, t9);
        TreeNode t7 = new TreeNode(13);
        TreeNode t6 = new TreeNode(2);
        TreeNode t5 = new TreeNode(7);
        TreeNode t4 = new TreeNode(11, t5, t6);
        TreeNode t3 = new TreeNode(4, t7, t8);
        TreeNode t2 = new TreeNode(8, t3, null);
        TreeNode t1 = new TreeNode(5, t4, t2);
        System.out.println(hasPathSum(t1, 22));
    }

}
