package dsAlgo.sorting;

public class SortColors {
  public static void main(String args[]){
    SortColors t = new SortColors();
    int[] nums = {2,0,2,1,1,0};
    t.sortColors(nums);
  }
  public void sortColors(int[] nums) {
    /*int l=0,mid=0,r= nums.length-1;
    while (mid<=r){
      if(nums[mid]==0){
        int temp = nums[mid];
        nums[mid] = nums[l];
        nums[l] = temp;

      }
    }*/
    int a=0,b=0,c=0;
    for (int i=0;i< nums.length;i++){
      if(nums[i]==0)
        a++;
      else if (nums[i]==1)
        b++;
      else
        c++;
    }
    for (int i=a-1;i>=0;i--)
      nums[i]=0;
    for (int i=a+b-1;i>=a;i--)
      nums[i]=1;
    for (int i=a+b+c-1;i>=a+b;i--)
      nums[i]=2;
    System.out.println();
  }
}
