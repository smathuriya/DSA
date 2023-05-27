package dsAlgo.BSTorBT;

public class ValidateBinarySearchTree {
  public static void main(String args[]){
    //TreeNode root = new TreeNode(2, new TreeNode(1,null,null),new TreeNode(3,null,null));
    TreeNode root = new TreeNode(2147483647,null,null);
    System.out.println(isValidBST(root));
  }
  public static boolean isValidBST(TreeNode root) {
    return fun(root, Long.MIN_VALUE, Long.MAX_VALUE);
  }

  private static boolean fun(TreeNode root, long minValue, long maxValue) {
    if(root==null)
      return true;
    if(root.val>=maxValue || root.val<=minValue)
      return false;
    return fun(root.left,minValue,root.val) && fun(root.right,root.val,maxValue);
  }
}
