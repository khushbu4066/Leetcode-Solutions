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
    public int maxAncestorDiff(TreeNode root) {
        return findMax(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int findMax(TreeNode root, int max, int min){
        if(root == null)return Math.abs(max-min);
        int val = root.val;
        max = Math.max(val, max);
        min = Math.min(val, min);
        return Math.max(findMax(root.left,max,min),findMax(root.right,max,min));
    }
}