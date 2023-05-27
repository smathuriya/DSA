package dsAlgo.BSTorBT;

public class KthSmallestElementinaBST {
  private static int num;
  private static int count=0;
  public static void main(String args[]){
    TreeNode root = new TreeNode(5,new TreeNode(3,new TreeNode(2,new TreeNode(1),null),new TreeNode(4)),new TreeNode(6));
    System.out.println(kthSmallest(root,3));
  }
  public static int kthSmallest(TreeNode root, int k) {
    fun(root,k);
    return num;
  }

  private static void fun(TreeNode root, int k) {
    if(root==null)
      return;
    fun(root.left,k);
    if(++count==k)
      num = root.val;
    fun(root.right,k);
  }
}
