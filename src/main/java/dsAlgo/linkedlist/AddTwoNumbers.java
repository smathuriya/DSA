package dsAlgo.linkedlist;

import dsAlgo.BSTorBT.ListNode;

public class AddTwoNumbers {
  public static void main(String args[]) {
    AddTwoNumbers obj = new AddTwoNumbers();
    ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    ListNode l = obj.addTwoNumbers(l1, l2);
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode node=null, temp;
    int num = 0;
    temp = node;
    while (l1 != null && l2 != null){
      num += l1.val + l2.val;
      ListNode temp1 = new ListNode(num%10);
      num = num/10;
      if(temp == null){
        temp = temp1;
        node = temp;
      }else {
        temp.next = temp1;
        temp = temp.next;
      }
      l1 = l1.next;
      l2 = l2.next;
    }
    while (l1 != null){
      num += l1.val;
      ListNode temp1 = new ListNode(num%10);
      num = num/10;
      temp.next = temp1;
      temp = temp.next;
      l1 = l1.next;
    }
    while (l2 != null){
      num += l2.val;
      ListNode temp1 = new ListNode(num%10);
      num = num/10;
      temp.next = temp1;
      temp = temp.next;
      l2 = l2.next;
    }
    if(num == 1)
      temp.next = new ListNode(1);
    return node;
  }
}
