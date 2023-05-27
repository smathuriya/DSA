package dsAlgo.BSTorBT;

public class ConvertSortedArraytoBinarySearchTree {
  public static void main(String args[]){
    int[] nums = {-10,-3,0,5,9};
    TreeNode root = sortedArrayToBST(nums);
    TreeNode obj = new TreeNode();
    obj.inorder(root);
  }

  public static TreeNode sortedArrayToBST(int[] nums) {
    return fun(nums,0,nums.length-1);
  }

  private static TreeNode fun(int[] nums, int l, int r) {
    if(l==r)
      return new TreeNode(nums[l]);
    if(l+1==r)
      return new TreeNode(nums[l],null,new TreeNode(nums[r],null,null));
    int mid = (l+r)/2;
    TreeNode node = new TreeNode(nums[mid]);
    node.left = fun(nums,l,mid-1);
    node.right = fun(nums,mid+1,r);
    return node;
  }
}
