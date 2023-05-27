package dsAlgo.BSTorBT;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LowestCommonAncestorofaBinarySearchTree {
  public static void main(String args[]){
    TreeNode five = new TreeNode(5);
    TreeNode seven = new TreeNode(7);
    TreeNode root = new TreeNode(6,new TreeNode(2,new TreeNode(0),
        new TreeNode(4,new TreeNode(3),five)),new TreeNode(8,seven,new TreeNode(9)));
    System.out.println(lowestCommonAncestor(root,five,seven).val);
  }
  public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
    List<TreeNode> lList = new ArrayList<>();
    findRoute(root,p,lList);
    List<TreeNode> rList = new ArrayList<>();
    findRoute(root,q, rList);
    int l=0,r=0;
    while (l<lList.size() && r<rList.size() && lList.get(l).val == rList.get(r).val){
      l++;r++;
    }
    return lList.get(--l);
  }
  private static boolean findRoute(TreeNode root, TreeNode p, List<TreeNode> list) {
    if(root==null)
      return false;
    list.add(root);
    if(root.val==p.val)
      return true;
    if(findRoute(root.left,p,list) || findRoute(root.right,p,list))
      return true;
    list.remove(list.size()-1);
    return false;
  }
}
