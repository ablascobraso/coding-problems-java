import commondatastructures.TreeNode;

public class MaximumDepthOfBinaryTree {
    public static int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return calculateDepth(root, 1);
    }

    private static int calculateDepth(TreeNode node, int counter) {
        if(node == null) return counter;
        if(node.left != null || node.right != null){
            counter++;
        }
        return Math.max(calculateDepth(node.left, counter), calculateDepth(node.right, counter));
    }

    public static void main(String[] args) {
        TreeNode node3left = new TreeNode(15, null, null);
        TreeNode node3right = new TreeNode(7, null, null);
        TreeNode node2left = new TreeNode(9, null, null);
        TreeNode node2right = new TreeNode(20, node3left, node3right);
        TreeNode root = new TreeNode(3, node2left, node2right);
        System.out.println(maxDepth(root));
    }
}
