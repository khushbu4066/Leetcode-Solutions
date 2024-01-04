class Solution {
    public int minOperations(int[] arr) {
        
        HashMap<Integer, Integer> kd = new HashMap<>();
        int n = arr.length;
        
        for(int i = 0; i<n; i++){
            kd.put(arr[i], kd.getOrDefault(arr[i],0)+1);
        }
        
        int result = 0;
        for(HashMap.Entry<Integer, Integer> entry : kd.entrySet()){
            int freq = entry.getValue();
            
            if(freq == 1){
                return -1;
            }
            
            result += Math.ceil((double)freq/3);
        }
        
        return result;
    }
}