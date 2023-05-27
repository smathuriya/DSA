package dsAlgo.BSTorBT;

public class ConvertBSTtoGreaterTree {
  Integer sum=null;
  public static void main(String args[]){
    //TreeNode root=new TreeNode(5,new TreeNode(3,new TreeNode(2),new TreeNode(4)),new TreeNode(20,new TreeNode(8),new TreeNode(25,new TreeNode(24,new TreeNode(23),null),new TreeNode(26))));
    TreeNode root=new TreeNode(1,new TreeNode(2,new TreeNode(3,new TreeNode(4),null),null),new TreeNode(2,null,new TreeNode(3,null,new TreeNode(4))));
    ConvertBSTtoGreaterTree t = new ConvertBSTtoGreaterTree();
    //TreeNode.inorder(t.convertBST(root));
    System.out.println(t.isBalanced(root));
  }

  public boolean isBalanced(TreeNode root) {
    if(root==null)
      return true;

    if(Math.abs(hight(root.left)-hight(root.right))<2 && isBalanced(root.left) && isBalanced(root.right))
      return true;
    return false;
  }

  private int hight(TreeNode node) {
    if(node==null)
      return 0;
    return Math.max(hight(node.left), hight(node.right))+1;
  }

  public TreeNode convertBST(TreeNode root) {
    // RNL
    rnl(root);
    //System.out.println("**");
    return root;
  }

  private void rnl(TreeNode node) {
    if(node==null)
      return;
    rnl(node.right);
    //System.out.print(node.val+" ");
    if(sum==null)
      sum=node.val;
    else {
      sum+=node.val;
      node.val=sum;
    }
    rnl(node.left);
  }
}
