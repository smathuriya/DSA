package dsAlgo;

public class BinarySearch {
  public static void main(String args[]){
    int[] arr = {1,2,3,4,5,6};
    System.out.println(search(arr,0,arr.length-1,1));
  }

  private static int search(int[] A, int l, int h, int key) {
    int mid = (l+h)/2;
    if(A[mid] == key)
      return mid;
    if(l==h)
      return -1;
    int lIndex = search(A, mid+1, h, key);
    int rIndex = search(A, l, mid,key);
    if(lIndex != -1)
      return lIndex;
    if(rIndex != -1)
      return rIndex;
    return -1;
  }
}
