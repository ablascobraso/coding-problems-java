import commondatastructures.TreeNode;

public class SymmetricTree101 {
    public static boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return areBothSymmetric(root.left, root.right);
    }

    private static boolean areBothSymmetric(TreeNode node1, TreeNode node2) {
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null) return false;
        return node1.val == node2.val && areBothSymmetric(node1.left, node2.right) && areBothSymmetric(node1.right, node2.left);
    }

    public static void main(String[] args) {
        TreeNode node3right = new TreeNode(3, null, null);
        TreeNode node4left = new TreeNode(2, null, null);
        TreeNode node4right = new TreeNode(2, null, null);
        TreeNode node2left = new TreeNode(2, null, node4left);
        TreeNode node2right = new TreeNode(2, node4right, node3right);
        TreeNode root = new TreeNode(1, node2left, node2right);
        System.out.println(isSymmetric(root));
    }
}
