package dsAlgo.BSTorBT;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {
  public static void main(String args[]){
    BinaryTreeLevelOrderTraversal t = new BinaryTreeLevelOrderTraversal();
    TreeNode root = new TreeNode(1,new TreeNode(2, new TreeNode(4), new TreeNode(5)),new TreeNode(3));
    System.out.println(t.levelOrder(root));
  }
  public List<List<Integer>> levelOrder(TreeNode root) {
    List<List<Integer>> ans = new ArrayList<>();
    fun(root, ans, 0);
    return ans;
  }

  private void fun(TreeNode node, List<List<Integer>> list, int level) {
    if(node == null)
      return;
    if(list.size()<=level)
      list.add(new ArrayList<>());
    list.get(level).add(node.val);
    fun(node.left,list,level+1);
    fun(node.right,list,level+1);
  }
}
