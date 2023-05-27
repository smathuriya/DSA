package dsAlgo.BSTorBT;

public class ConvertSortedListtoBinarySearchTree {
  public static void main(String args[]){
    //ListNode list = new ListNode(-10,new ListNode(-3, new ListNode(0,new ListNode(5,new ListNode(9)))));
    ListNode list = new ListNode(3,new ListNode(4));
    TreeNode root = sortedListToBST(list);
    TreeNode obj = new TreeNode();
    obj.inorder(root);
  }
  public static TreeNode sortedListToBST(ListNode head) {
    return fun(head,null);
  }

  private static TreeNode fun(ListNode head, ListNode tail) {
    ListNode slow = head;
    ListNode fast = head;
    if(head==tail)
      return null;
    while(fast!=tail && fast.next!=tail){
      slow=slow.next;
      fast=fast.next.next;
    }
    TreeNode node = new TreeNode(slow.val);
    node.left = fun(head, slow);
    node.right = fun(slow.next,tail);
    return  node;
  }
}
