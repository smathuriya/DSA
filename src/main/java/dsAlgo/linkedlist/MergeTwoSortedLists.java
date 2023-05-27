package dsAlgo.linkedlist;

import dsAlgo.BSTorBT.ListNode;

public class MergeTwoSortedLists {
  public static void main(String args[]){
    MergeTwoSortedLists t = new MergeTwoSortedLists();
    ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
    ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
    ListNode list3 = new ListNode(3);
    ListNode list4 = new ListNode(2);
    ListNode list5 = new ListNode(0);
    ListNode list6 = new ListNode(-4,list4);
    list3.next = list4;
    list4.next = list5;
    list5.next = list6;
    System.out.println(t.hasCycle(list3));
    /*ListNode head = t.mergeTwoLists(list1,list2);
    while (head!=null){
      System.out.print(head.val+" ");
      head = head.next;
    }*/
  }

  public boolean hasCycle(ListNode head) {
    if (head == null)
      return false;
    ListNode slow = head;
    ListNode fast = head;
    while (fast!=null && fast.next!=null){

    }
    return false;
  }
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1 == null) return l2;
    if(l2 == null) return l1;
    if(l1.val < l2.val){
      l1.next = mergeTwoLists(l1.next, l2);
      return l1;
    } else{
      l2.next = mergeTwoLists(l1, l2.next);
      return l2;
    }
  }
}
