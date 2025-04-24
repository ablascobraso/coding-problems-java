import commondatastructures.TreeNode;

public class MinimumDepthOfBinaryTree111 {
    public static int minDepth(TreeNode node) {
        if (node == null) return 0;
        if (node.left == null) return minDepth(node.right) + 1;
        if (node.right == null) return minDepth(node.left) + 1;
        return Math.min(minDepth(node.left), minDepth(node.right)) + 1;
    }


    public static void main(String[] args) {
        TreeNode node6 = new TreeNode(-6, null, null);
        TreeNode node5 = new TreeNode(-5, null, null);
        TreeNode node0 = new TreeNode(0, null, null);
        TreeNode node41 = new TreeNode(4, node6, null);
        TreeNode node42 = new TreeNode(9, node5, null);
        TreeNode node3 = new TreeNode(9, null, node41);
        TreeNode node2 = new TreeNode(9, node42, node0);
        TreeNode node9 = new TreeNode(9, node3, node2);
        System.out.println(minDepth(node9));
    }
}
