package dsAlgo.array;

public class SearchinRotatedSortedArray {
  public static void main(String args[]){
    SearchinRotatedSortedArray t = new SearchinRotatedSortedArray();
    int[] nums = {3,1};
    System.out.println(t.search(nums,3));
  }
  public int search(int[] nums, int target) {
    int l=0,r= nums.length-1;
    while (l<r){
      int mid = (l+r)/2;
      if(nums[mid]>nums[r]) l=mid+1;
      else r=mid;
    }
    int rot=l;
    l=0;r= nums.length-1;
    // The usual binary search and accounting for rotation.
    while(l<=r){
      int mid=(l+r)/2;
      int realmid=(mid+rot)% nums.length;
      if(nums[realmid]==target)return realmid;
      if(nums[realmid]<target)l=mid+1;
      else r=mid-1;
    }
    return -1;
  }
}
