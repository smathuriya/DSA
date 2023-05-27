package dsAlgo;

import java.util.ArrayList;
import java.util.List;

public class AllPossibleFullBinaryTrees_894 {
  public static void main(String args[]){
    List<TreeNode> list = allPossibleFBT(7);
    System.out.println(list.size());
  }
  static public List<TreeNode> allPossibleFBT(int n) {
    if(n==1){
      List<TreeNode> list = new ArrayList<>();
      list.add(new TreeNode(0,null,null));
      return list;
    }
    List<TreeNode> list = new ArrayList<>();
    for (int i=1;i<n;i+=2){
      List<TreeNode> l = allPossibleFBT(i);
      List<TreeNode> r = allPossibleFBT(n-i-1);
      for (TreeNode ln : l){
        for (TreeNode rn : r){
          TreeNode root = new TreeNode(0,null,null);
          root.left = ln;
          root.right = rn;
          list.add(root);
        }
      }
    }
  return list;
  }
}


class TreeNode {
  int val;
  TreeNode left;
  TreeNode right;
  TreeNode() {}
  TreeNode(int val) { this.val = val; }
  TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}