package dsAlgo.linkedlist;

import dsAlgo.BSTorBT.ListNode;

public class AddTwoNumbersII {
  public static void main(String args[]){
    AddTwoNumbersII obj = new AddTwoNumbersII();
    ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    obj.addTwoNumbers(l1, l2);
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    l1 = reverseList(l1);
    l2 = reverseList(l2);
    int num = 0;
    ListNode node=null;
    ListNode head=null;
    while (l1 != null && l2 != null){
      num += l1.val + l2.val;
      if(node == null){
        node = new ListNode(num%10);
        head = node;
      }else {
        node.next = new ListNode(num%10);
        node = node.next;
      }
      num = num/10;
      l1 = l1.next;
      l2 = l2.next;
    }
    while (l1 != null){
      num += l1.val;
      node.next = new ListNode(num%10);
      node = node.next;
      num = num/10;
      l1 = l1.next;
    }
    while (l2 != null){
      num += l2.val;
      node.next = new ListNode(num%10);
      node = node.next;
      num = num/10;
      l2 = l2.next;
    }
    if(num == 1)
      node.next = new ListNode(1);
    return reverseList(head);
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
