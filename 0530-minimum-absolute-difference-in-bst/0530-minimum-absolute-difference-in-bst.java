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
    
    private static void preOrder(TreeNode root, List<Integer>v){
        if(root == null) return;
        
        v.add(root.val);
        preOrder(root.left, v);
        preOrder(root.right, v);
    }
    
    public int getMinimumDifference(TreeNode root) {
        
        List<Integer> v = new ArrayList<>();
        preOrder(root, v);
        
        int n = v.size();
        
        int min_diff = Integer.MAX_VALUE;
        
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                int x = Math.abs(v.get(i) - v.get(j));
                if(min_diff > x){
                    min_diff = x;
                }
            }
        }
        return min_diff;
    }
}