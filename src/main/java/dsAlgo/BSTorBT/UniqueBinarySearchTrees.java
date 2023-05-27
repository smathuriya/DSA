package dsAlgo.BSTorBT;

public class UniqueBinarySearchTrees {
  public static void main(String args[]) {
    System.out.println(numTrees(3));
  }

  public static int numTrees(int n) {
    int[] temp = new int[n + 1];
    temp[0] = temp[1] = 1;
    for (int i = 2; i <= n; i++) {
      for (int j = 0; j < i; j++) {
        temp[i] += temp[j]*temp[i-j-1];
      }
    }
    return temp[n];
  }
}
