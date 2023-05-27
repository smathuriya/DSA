package dsAlgo.BSTorBT;

public class TrimaBinarySearchTree {
  public static void main(String args[]){
    TrimaBinarySearchTree obj = new TrimaBinarySearchTree();
    //TreeNode root = new TreeNode(3,new TreeNode(0,null,new TreeNode(2,new TreeNode(1),null)),new TreeNode(4,null,new TreeNode(6)));
    TreeNode root = new TreeNode(1,null,new TreeNode(2));
    TreeNode.inorder(obj.trimBST(root,2,4));



  }
  public TreeNode insertIntoBST(TreeNode root, int val) {
    if(root == null)
      return new TreeNode(val);
    TreeNode temp=null,node=root;
    while (root!=null){
      temp = root;
      if(root.val<val)
        root = root.right;
      else if (root.val>val)
          root = root.left;
    }
    if(temp.val<val){
      temp.right=new TreeNode(val);
    }else
      temp.left=new TreeNode(val);
    return node;
  }

  public TreeNode trimBST(TreeNode root, int low, int high) {
    TreeNode n2 = root, n1 = root;
    while (n2!=null){
      if(n1.val >= low && n2.val < low)
        break;
      n1=n2;
      if(n2.val>=low){
        n2=n2.left;
      } else if (n2.val<low) {
        n2=n2.right;
      }
    }
    if(n2!=null){
      n1.left = n2.right;
    }
//
    n2 = root; n1 = root;
    while (n2!=null){
      if(n1.val <= high && n2.val > high)
        break;
      n1=n2;
      if(n2.val>high){
        n2=n2.left;
      } else if (n2.val<=high) {
        n2=n2.right;
      }
    }
    if(n2!=null){
      n1.right = n2.left;
    }
    return root;
  }
}
