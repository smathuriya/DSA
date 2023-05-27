package dsAlgo.BSTorBT;

import java.util.HashMap;
import java.util.Map;

public class ConstructBinaryTreefromPreorderandInorderTraversal {
  public static void main(String args[]){
    ConstructBinaryTreefromPreorderandInorderTraversal t = new ConstructBinaryTreefromPreorderandInorderTraversal();
    int[] preorder = {3,9,20,15,7}, inorder = {9,3,15,20,7};

    t.buildTree(preorder,inorder);
  }
  public TreeNode buildTree(int[] preorder, int[] inorder) {
    Map<Integer,Integer> map = new HashMap<>();
    for (int i=0;i< inorder.length;i++){
      map.put(inorder[i],i);
    }
    return fun(preorder,0,preorder.length-1,inorder,0,inorder.length-1,map);
  }

  private TreeNode fun(int[] preorder, int ps, int pe, int[] inorder, int is, int ie, Map<Integer, Integer> map) {
    if(pe<ps || ie<is)
      return null;
    TreeNode root = new TreeNode(preorder[ps]);
    int rootIndex = map.get(root.val);
    int numsLeft = rootIndex - is;
    root.left = fun(preorder, ps+1, ps+numsLeft, inorder, is,rootIndex-1,map);
    root.right = fun(preorder, ps+numsLeft+1,pe,inorder,rootIndex+1,ie,map);
    return root;
  }

}
