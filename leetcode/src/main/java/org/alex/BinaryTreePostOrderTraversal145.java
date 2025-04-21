import commondatastructures.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostOrderTraversal145 {

    private static List<Integer> postorderTraversal(TreeNode node1) {
        List<Integer> result = new ArrayList<>();
        postorderTraversalHelperUsingStack(result, node1);
        return result;
    }

    private static void postorderTraversalHelper(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }
        postorderTraversalHelper(result, node.left);
        postorderTraversalHelper(result, node.right);
        result.add(node.val);
    }

    private static void postorderTraversalHelperUsingStack(List<Integer> result, TreeNode node) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> output = new LinkedList<>();
        if (node == null) {
            return;
        }
        stack.push(node);

        while (!stack.isEmpty()) {
            TreeNode popped = stack.pop();
            output.addFirst(popped.val);
            if (popped.left != null) {
                stack.push(popped.left);
            }
            if (popped.right != null) {
                stack.push(popped.right);
            }
        }
        result.addAll(output);
    }


    public static void main(String[] args) {
        TreeNode node3 = new TreeNode(3, null, null);
        TreeNode node2 = new TreeNode(2, node3, null);
        TreeNode node1 = new TreeNode(1, null, node2);

        List<Integer> result = postorderTraversal(node1);
        result.forEach(System.out::println);
    }
}
