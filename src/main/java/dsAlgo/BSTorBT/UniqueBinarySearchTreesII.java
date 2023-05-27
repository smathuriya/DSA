package dsAlgo.BSTorBT;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UniqueBinarySearchTreesII {
  public static void main(String args[]){
    System.out.println(generateTrees(3));
  }
  public static List<TreeNode> generateTrees(int n) {
    return fun(1,n);
  }

  private static List<TreeNode> fun(int l, int r) {
    List<TreeNode> res = new LinkedList<>();
    if(l>r){
      res.add(null);
      return res;
    }
    for (int i=l;i<=r;i++){
      List<TreeNode> leftsubtree = fun(0,i-1);
      List<TreeNode> rightsubtree = fun(i+1,r);
      for (int j=0;j<leftsubtree.size();j++){
        for (int k=0;k< rightsubtree.size();k++){
          TreeNode node = new TreeNode(i);
          node.left = leftsubtree.get(j);
          node.right = rightsubtree.get(k);
          res.add(node);
        }
      }
    }
    return res;
  }
}
