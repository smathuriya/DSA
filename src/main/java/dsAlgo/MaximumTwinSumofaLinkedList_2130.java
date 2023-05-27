package dsAlgo;

public class MaximumTwinSumofaLinkedList_2130 {
  public static void main(String args[]){
    ListNode he = new ListNode(5);
    he.next = new ListNode(4);
    he.next.next = new ListNode(2);
    he.next.next.next = new ListNode(1);
    System.out.println(pairSum(he));
  }
  static public int pairSum(ListNode head) {
    ListNode h = head;
    ListNode sn = head;
    ListNode fn = head;
    while (fn.next.next!=null){
      sn = sn.next;
      fn = fn.next.next;
    }
    ListNode m = sn;
    sn = sn.next;
    m.next =null;
    ListNode t1,t2,t3=null;
    t1 = sn;
    t2 = sn.next;

    if(t2!=null)
      t3 = t2.next;
    while (t2!=null){
      t2.next = t1;
      t1=t2;
      t2=t3;
      if(t3!=null)
        t3 = t3.next;
    }
    int ans = 0;
    while (h!=null){
      ans = ans < h.val+ t1.val ? h.val+ t1.val : ans;
      h=h.next;
      t1=t1.next;
    }
    return ans;
  }
}

class ListNode {
  int val;
  ListNode next;
  ListNode() {}
  ListNode(int val) { this.val = val; }
  ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
