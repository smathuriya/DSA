package dsAlgo.linkedlist;

import dsAlgo.BSTorBT.ListNode;

public class ReverseLinkedList {
  public static void main(String args[]){
    ReverseLinkedList obj = new ReverseLinkedList();
    ListNode ll = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    ListNode node = obj.reverseList(ll);
    System.out.println("HI");
  }

  public ListNode reverseList(ListNode head) {
    ListNode l1 = null, l2 = head, l3 = null;
    while (l2 != null){
      l3 = l2.next;
      l2.next = l1;
      l1 = l2;
      l2 = l3;
    }
    return l1;
  }
}
