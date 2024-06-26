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
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> se = new ArrayList<>();
        inordertrav(root,se);
        return buildbalanceBST(se,0, se.size()-1);
    }
    public void inordertrav(TreeNode root, List<Integer> se){
        if(root==null){
            return;
        }
        inordertrav(root.left,se);
        se.add(root.val);
        inordertrav(root.right,se);
    }
    public TreeNode buildbalanceBST(List<Integer> se, int s, int e){
        if(s>e) return null;
        int m=s+(e-s)/2;
        TreeNode root = new TreeNode(se.get(m));
        root.left = buildbalanceBST(se,s,m-1);
        root.right = buildbalanceBST(se,m+1,e);
        return root;
    }
}