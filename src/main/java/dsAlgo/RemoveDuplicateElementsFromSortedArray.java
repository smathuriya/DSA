package dsAlgo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateElementsFromSortedArray {
  public static void main(String args[]){

    int A[] = {1,3,4,5,6,12,13,17,19,22,23,25,27,28,28,35,36,37,39,43,46,48,54,59,62,63,65,68,68,70,70,72,79,82,83,92,92,93,95,96,96,100};
    System.out.println(remove_duplicate(A, A.length));
  }

  private static int remove_duplicate(int[] A, int N) {
    Set<Integer> set = new TreeSet<>();
    for(int i=0;i<N;i++){
      set.add(A[i]);
    }
    int i=0;
    for(int a : set){
      A[i++] = a;
    }
    return set.size();
  }
}
