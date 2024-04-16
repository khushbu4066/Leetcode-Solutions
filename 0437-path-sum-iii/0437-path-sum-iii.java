class Solution {
    int count =0;
    ArrayList<Long> list = new ArrayList<>();
    public int pathSum(TreeNode root, int targetSum) {
        getSum(root, targetSum);
        return count;
    }
    public void getSum(TreeNode root, int sum) {
        if(root == null) return;
        list.add((long)root.val);
        getSum(root.left, sum);
        getSum(root.right, sum);
        long temp =0;
        for(int i=list.size()-1; i>=0; i--) {
            temp += list.get(i);
            if(temp == sum) {
                count++;
            }
        }
        list.remove(list.size()-1);
    }
}