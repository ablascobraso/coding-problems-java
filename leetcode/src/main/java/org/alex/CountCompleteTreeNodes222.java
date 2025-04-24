import commondatastructures.TreeNode;

class CountCompleteTreeNodes222 {
    public static void main(final String[] args) {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, null, null);
        TreeNode node1 = new TreeNode(1, node2, node3);
        System.out.println(countNodes(node1));
    }

    public static int countNodes(TreeNode root) {
        if (root == null) return 0;
        int lh = leftHeight(root);
        int rh = rightHeight(root);
        if (lh == rh) {
            return (int) Math.pow(2, lh) - 1;
        }
        return countNodes(root.left) + countNodes(root.right) + 1;
    }

    private static int leftHeight(TreeNode root) {
        if (root == null) return 0;
        return leftHeight(root.left) + 1;
    }

    private static int rightHeight(TreeNode root) {
        if (root == null) return 0;
        return rightHeight(root.right) + 1;
    }
}