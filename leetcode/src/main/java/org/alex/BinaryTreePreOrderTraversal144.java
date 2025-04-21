import commondatastructures.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreOrderTraversal144 {

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorder(root, res);
        return res;
    }

    private static void preorder(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        res.add(node.val);
        preorder(node.left, res);
        preorder(node.right, res);
    }

    private static void preorderUsingStack(TreeNode node, List<Integer> res) {
        if (node == null) {
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.addElement(node);

        while (!stack.isEmpty()) {
            TreeNode popped = stack.pop();
            res.add(popped.val);
            if (popped.right != null) {
                stack.addElement(popped.right);
            }
            if (popped.left != null) {
                stack.push(popped.left);
            }
        }
    }

    public static void main(String[] args) {

        TreeNode node3 = new TreeNode(3);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);

        inorderTraversal(node1).forEach(System.out::println);
    }
}
