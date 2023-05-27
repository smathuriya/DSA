package dsAlgo;

import java.util.Collections;
import java.util.PriorityQueue;

public class Merge_k_SortedLists {

  public static void main(String args[]){
    PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
    queue.add(10);
    queue.add(5);
    queue.add(12);
    System.out.println(queue.poll());
    System.out.println(queue.poll());
  }
}
