package dsAlgo.BSTorBT;

public class RecoverBinarySearchTree {


  public static void main(String args[]){
    TreeNode root = new TreeNode(3,new TreeNode(1),new TreeNode(4,new TreeNode(2),null));
    RecoverBinarySearchTree v = new RecoverBinarySearchTree();
    v.recoverTree(root);
    System.out.println("");
  }

  public void recoverTree(TreeNode root) {
    TreeNode prev;

  }
}
