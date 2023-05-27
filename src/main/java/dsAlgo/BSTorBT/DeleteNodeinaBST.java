package dsAlgo.BSTorBT;

public class DeleteNodeinaBST {
  public static void main(String args[]){
    //TreeNode root = new TreeNode(6,new TreeNode(2,new TreeNode(1), new TreeNode(4,new TreeNode(3),new TreeNode(5))),new TreeNode(8,new TreeNode(7),new TreeNode(9)));
    //TreeNode root=new TreeNode(5,new TreeNode(3,new TreeNode(2),new TreeNode(4)),new TreeNode(20,new TreeNode(8),new TreeNode(25,new TreeNode(24,new TreeNode(23),null),new TreeNode(26))));
    TreeNode root = new TreeNode(1,null,new TreeNode(2));
    DeleteNodeinaBST obj = new DeleteNodeinaBST();
    TreeNode op = obj.deleteNode(root,1);
    TreeNode.inorder(op);
  }
  public TreeNode deleteNode(TreeNode node, int key) {
    if(node==null)
      return null;
    if(node.val==key && node.left==null&&node.right!=null){
      return node.right;
    }
    if(node.val==key && node.left!=null&&node.right==null){
      return node.left;
    }
    TreeNode prev = null;
    TreeNode currentNode = node;
    while (currentNode!=null && currentNode.val!=key){
      prev = currentNode;
      if(currentNode.val<key)
        currentNode=currentNode.right;
      else if(currentNode.val>key)
        currentNode=currentNode.left;
      else
        break;
    }
    if(currentNode==null)
      return node;
    if(currentNode.left==null&&currentNode.right==null){
      if(prev==null)
        return null;
      if(prev.left==currentNode)
        prev.left=null;
      else
        prev.right=null;
      return node;
    }
    if(currentNode.left==null&&currentNode.right!=null){
      if(prev.left==currentNode)
        prev.left=currentNode.right;
      else
        prev.right=currentNode.right;
      return node;
    }
    if(currentNode.left!=null&&currentNode.right==null){
      if(prev.left==currentNode)
        prev.left=currentNode.left;
      else
        prev.right=currentNode.left;
      return node;
    }
    TreeNode n1=null;
    TreeNode n2=currentNode.right;
    while (n2.left!=null){
      n1=n2;
      n2=n2.left;
    }
    if(currentNode.right!=n2){
      n2.left=currentNode.left;
      n1.left=n2.right;
      n2.right=currentNode.right;
    }
    else {
      n2.left=currentNode.left;
      n1=n2;
    }
    if(currentNode==node)
      return n2;
    else{
      if(prev.left==currentNode){
        prev.left=n2;
      }else {
        prev.right=n2;
      }
    }
      return node;
  }
}
