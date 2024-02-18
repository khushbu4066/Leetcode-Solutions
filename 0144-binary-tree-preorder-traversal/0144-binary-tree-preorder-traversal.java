/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> preOrder = new ArrayList<>();
        
        if(root == null){
            return preOrder;
        }
        
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        
        while(!st.isEmpty()){
            TreeNode topNode = st.peek();
            preOrder.add(topNode.val);
            st.pop();
            
            if(topNode.right != null)
                st.push(topNode.right);
            
            if(topNode.left != null){
                st.push(topNode.left);
            }  
            
        }
        return preOrder;
    }
}