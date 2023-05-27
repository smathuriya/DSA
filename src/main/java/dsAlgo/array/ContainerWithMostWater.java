package dsAlgo.array;

public class ContainerWithMostWater {
  public static void main(String args[]){
    ContainerWithMostWater t = new ContainerWithMostWater();
    int[] height = {1,3,2,5,25,24,5};
    int ans = t.maxArea(height);
    System.out.println(ans);
  }
  public int maxArea(int[] height) {
    int l=0,r=height.length-1;
    int ans = 0;
    while (l<r){
      int temp = Math.min(height[l], height[r]) * (r-l);
      ans = ans < temp? temp : ans;

      if(height[l] <= height[r]){
        l++;
      }else {
        r--;
      }
    }
    return ans;
  }
}
