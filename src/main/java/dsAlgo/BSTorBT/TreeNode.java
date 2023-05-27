package dsAlgo.BSTorBT;

public class TreeNode {
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

      public static void inorder(TreeNode node){
        if(node == null)
          return;
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
      }
  }