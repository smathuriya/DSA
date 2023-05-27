package dsAlgo.BSTorBT;

public class ConstructBinarySearchTreefromPreorderTraversal {
  public static void main(String args[]){
    int[] preorder = {8,5,1,7,10,12};
    bstFromPreorder(preorder);
  }
  public static TreeNode bstFromPreorder(int[] preorder) {
    TreeNode root = new TreeNode(preorder[0]);
    for (int i=1;i< preorder.length;i++)
      add(root,preorder[i]);
    return root;
  }

  private static void add(TreeNode root, int ele) {
    TreeNode temp = root;
    while (root!=null){
      temp = root;
      if (root.val<ele)
        root=root.right;
      else
        root=root.left;
    }
    if(temp.val<ele)
      temp.right=new TreeNode(ele);
    else
      temp.left=new TreeNode(ele);
  }
}
