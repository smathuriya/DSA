package dsAlgo;

public class MajorityElement {

  public static void main(String args[]){
    int[] a = {3,1,3,3,2};
    System.out.println(majorityElement(a, a.length));
  }

  static int majorityElement(int a[], int size)
  {
    int maxIndex = 0;
    int count = 1;
    for(int i=1;i<size;i++){
      if(a[maxIndex]==a[i]){
        count++;
      }else {
        count--;
        if(count==0){
          maxIndex = i;
          count=1;
        }
      }
    }
    count =0;
    for (int i=0;i<size;i++){
      if(a[i]==a[maxIndex])
        count++;
    }
    if(count>=size/2)
      return a[maxIndex];
    else
      return -1;
  }
}
