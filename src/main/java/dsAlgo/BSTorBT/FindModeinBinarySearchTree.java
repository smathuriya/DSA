package dsAlgo.BSTorBT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindModeinBinarySearchTree {
  private int currVal;
  private int currCount = 0;
  private int maxCount = 0;
  private int modeCount = 0;

  private int[] modes;
  public static void main(String args[]){
    TreeNode obj = new TreeNode();
    //TreeNode root=new TreeNode(5,new TreeNode(3,new TreeNode(2),new TreeNode(4)),new TreeNode(20,new TreeNode(8),new TreeNode(25,new TreeNode(24,new TreeNode(23),null),new TreeNode(26))));
    TreeNode root=new TreeNode(1,null,new TreeNode(2,new TreeNode(2),null));
    FindModeinBinarySearchTree t = new FindModeinBinarySearchTree();
    int[] ans = t.findMode(root);
    for (int i : ans)
      System.out.print(i+" ");
  }
  private void handleValue(int val) {
    if (val != currVal) {
      currVal = val;
      currCount = 0;
    }
    currCount++;
    if (currCount > maxCount) {
      maxCount = currCount;
      modeCount = 1;
    } else if (currCount == maxCount) {
      if (modes != null)
        modes[modeCount] = currVal;
      modeCount++;
    }
  }

  private void inorder(TreeNode root) {
    if (root == null) return;
    inorder(root.left);
    handleValue(root.val);
    inorder(root.right);
  }
  public int[] findMode(TreeNode root) {
    inorder(root);
    modes = new int[modeCount];
    modeCount = 0;
    currCount = 0;
    inorder(root);
    return modes;
  }
}
