package dsAlgo.BSTorBT;

public class MinimumAbsoluteDifferenceinBST {
  Integer temp;
  int ans=Integer.MAX_VALUE;
  public static void main(String args[]){
    TreeNode obj = new TreeNode();
    //TreeNode root=new TreeNode(5,new TreeNode(3,new TreeNode(2),new TreeNode(4)),new TreeNode(20,new TreeNode(8),new TreeNode(25,new TreeNode(24,new TreeNode(23),null),new TreeNode(26))));
    TreeNode root=new TreeNode(1,new TreeNode(0),new TreeNode(48,new TreeNode(12),new TreeNode(49)));
    MinimumAbsoluteDifferenceinBST t = new MinimumAbsoluteDifferenceinBST();
    System.out.print(t.getMinimumDifference(root));
  }
  public int getMinimumDifference(TreeNode root) {
    fun(root);
    return ans;
  }

  private void fun(TreeNode node) {
    if(node==null)
      return;
    fun(node.left);
    //System.out.println(node.val);
    if(temp==null)
      temp=node.val;
    else {
      ans = ans < Math.abs(temp - node.val) ? ans : Math.abs(temp - node.val);
      temp = node.val;
    }
    fun(node.right);
  }
}
