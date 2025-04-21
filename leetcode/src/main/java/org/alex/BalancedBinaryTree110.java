import commondatastructures.TreeNode;

public class BalancedBinaryTree110 {
    public static boolean isBalanced(TreeNode node) {
        if(node == null || node.left == null && node.right == null) return true;
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.abs(leftHeight - rightHeight) < 2
                && isBalanced(node.left)
                && isBalanced(node.right);
    }

    private static int getHeight(TreeNode node) {
        if(node == null) return 0;
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


    public static void main(String[] args) {
        TreeNode node15 = new TreeNode(15, null, null);
        TreeNode node7 = new TreeNode(7, null, null);
        TreeNode node20 = new TreeNode(20, node15, node7);
        TreeNode node9 = new TreeNode(9, null, null);
        TreeNode node3 = new TreeNode(3, node9, node20);
        System.out.println(isBalanced(node3));
    }
}
