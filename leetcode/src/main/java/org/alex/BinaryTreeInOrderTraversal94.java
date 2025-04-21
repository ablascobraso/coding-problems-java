import commondatastructures.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInOrderTraversal94 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        inorder(root, res);
        return res;
    }

    private static void inorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        inorder(node.left, res);
        res.add(node.val);
        inorder(node.right, res);
    }

    public static void main(String[] args) {

        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);

        inorderTraversal(node1).forEach(System.out::println);
    }
}
