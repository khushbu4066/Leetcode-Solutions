class Solution {
    public int[] findErrorNums(int[] arr) {
        
        int n = arr.length;
        int miss = 0, dup = 0;
        
        HashMap<Integer, Integer> ans = new HashMap<>();
        for(int x: arr){
            ans.put(x, ans.getOrDefault(x,0)+1);
        }
        
        for(int i = 1; i<=n; i++){
            if(ans.containsKey(i)){
                if(ans.get(i)==2){
                    dup = i;
                }
            }
            else{
                miss = i;
            }
        }
        
        return new int[]{dup,miss};
    }
}