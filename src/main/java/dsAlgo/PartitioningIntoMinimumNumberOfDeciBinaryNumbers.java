package dsAlgo;

public class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
  public static void main(String args[]){
    String n = "187";
    int res = 0;
    for (int i = 0; i < n.length(); ++i)
      res = res > n.charAt(i) - '0' ? res : n.charAt(i) - '0';
    System.out.println(res);
  }

}
