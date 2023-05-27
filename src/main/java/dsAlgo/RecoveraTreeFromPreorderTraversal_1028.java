package dsAlgo;

import java.util.Stack;

public class RecoveraTreeFromPreorderTraversal_1028 {
  public static void main(String args[])
  {
    String str = "1-2--3--4-5--6--7";
    RecoveraTreeFromPreorderTraversal_1028 n = new RecoveraTreeFromPreorderTraversal_1028();
    TreeNode node = n.recoverFromPreorder(str);
    System.out.println(node.val);
    printInorder(node);
  }

  private static void printInorder(TreeNode node) {
    if(node == null)
      return;
    printInorder(node.left);
    System.out.println(node.val);
    printInorder(node.right);
  }

  public TreeNode recoverFromPreorder(String traversal) {
    Stack<StackObj> stack = new Stack<>();
    StackObj sb = new StackObj(new TreeNode(traversal.charAt(0)-'0', null, null), 0);
    stack.push(sb);
    for (int i=1;i<traversal.length();){
      int l = 0;
      while (i<traversal.length() && traversal.charAt(i)=='-'){
        l++;
        i++;
      }
      if(traversal.charAt(i)!='-'){
        if(!stack.empty() && stack.peek().level < l){
          TreeNode tn = new TreeNode(traversal.charAt(i)-'0', null, null);
          StackObj so = new StackObj(tn, l);
          stack.peek().node.left = tn;
          stack.push(so);
          i++;
          continue;
        }
        while (!stack.empty() && stack.peek().level >= l){
          stack.pop();
        }
        stack.peek().node.right = new TreeNode(traversal.charAt(i)-'0', null, null);
        stack.pop();
        i++;
      }
    }
    while (stack.size() > 1) {
      stack.pop();
    }
    return stack.pop().node;
  }

  class StackObj{
    TreeNode node;
    int level;
    StackObj(TreeNode n, int v){
      this.node = n;
      this.level = v;
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
}
