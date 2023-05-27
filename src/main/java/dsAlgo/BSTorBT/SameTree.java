package dsAlgo.BSTorBT;

public class SameTree {
  public static void main(String args[]){
    TreeNode nodd1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    TreeNode nodd2 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
    System.out.println(isSameTree(nodd1, nodd2));
  }

  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if(p==null && q==null)
      return true;
    if(p==null || q==null)
      return false;
    if(p.val != q.val)
      return false;
    return isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
  }
}
