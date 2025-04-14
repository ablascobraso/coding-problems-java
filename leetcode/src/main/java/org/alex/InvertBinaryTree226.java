package org.alex;

public class InvertBinaryTree226
{
  public static TreeNode invertTree(TreeNode root) {
    if (root == null) return null;
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;
    invertTree(root.left);
    invertTree(root.right);
    return root;
  }

  private static void preOrder(TreeNode node)
  {
    if(node == null){
      return;
    }
    System.out.println(node.val);
    preOrder(node.left);
    preOrder(node.right);
  }


  public static void main(String[] args)
  {
    TreeNode node1 = new TreeNode(1, null, null);
    TreeNode node3 = new TreeNode(3, null, null);
    TreeNode node2 = new TreeNode(2, node1, node3);
    TreeNode node6 = new TreeNode(6, null, null);
    TreeNode node9 = new TreeNode(9, null, null);
    TreeNode node7 = new TreeNode(7, node6, node9);
    TreeNode node4 = new TreeNode(4, node2, node7);
    TreeNode invertedTree = invertTree(node4);
    preOrder(invertedTree);
  }
}

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }
