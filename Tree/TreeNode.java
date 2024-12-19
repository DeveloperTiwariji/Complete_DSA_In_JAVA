public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
 
class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
       return createTree(preorder, 0, preorder.length-1, inorder, 0, inorder.length-1); 
    }

    public TreeNode createTree(int pre[], int plo, int phi, int in[], int ilo, int ihi){
        
        if(plo>phi || ilo> ihi){
            return null;
        }
        TreeNode node = new TreeNode(pre[plo]);
        int idx = Search(in, ilo, ihi, pre[plo]);
        int net = idx-ilo;
        node.left = createTree(pre, plo+1, plo+net, in, ilo, idx-1);
        node.right = createTree(pre, plo+net+1, phi, in, idx+1,ihi);
        return node;
    }

    public int Search(int in[], int low, int heigh, int key){

        for(int i= low; i<=heigh;i++){
            if(in[i] == key){
                return i;
            }
        }
        return 0;
    }

}
