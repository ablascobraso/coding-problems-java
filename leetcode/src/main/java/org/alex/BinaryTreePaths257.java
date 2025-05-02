package org.alex;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257
{
  public static List<String> binaryTreePaths(TreeNode root) {
    if (root == null) return List.of();
      ArrayList<String> result = new ArrayList<>();
      binaryTreePathsHelper(root, "", result);
      return result;
  }

    public static void binaryTreePathsHelper(TreeNode node, String path, List<String> result) {
        if (node == null) return;

        if (path.isEmpty()) {
            path = String.valueOf(node.val);
        } else {
            path = path + "->" + node.val;
        }

        if (node.left == null && node.right == null) {
            result.add(path);
            return;
        }

        if (node.left != null) {
            binaryTreePathsHelper(node.left, path, result);
        }
        if (node.right != null) {
            binaryTreePathsHelper(node.right, path, result);
        }
    }


  public static void main(String[] args)
  {
    TreeNode node5 = new TreeNode(5, null, null);
    TreeNode node3 = new TreeNode(3, null, null);
    TreeNode node2 = new TreeNode(2, null, node5);
    TreeNode node1 = new TreeNode(1, node2, node3);
    System.out.println(binaryTreePaths(node1));
  }
}