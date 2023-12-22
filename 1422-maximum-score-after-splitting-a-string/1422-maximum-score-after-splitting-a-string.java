class Solution {
    public int maxScore(String s) {
        
        int result = Integer.MIN_VALUE;
        int n = s.length();
        
        for(int i = 0; i<=n-2; i++){
            
            int count_zero = 0;
            
            // 0 to i zero count
            for(int j = 0; j<=i; j++){
                if(s.charAt(j) == '0'){
                    count_zero++;
                }
            }
            
            // i+1 to n-2 one count
            int count_one = 0;
            for(int j = i+1; j<n; j++){
                if(s.charAt(j) =='1'){
                    count_one++;
                }
            }
            result = Math.max(result, count_zero+count_one);
        }
        return result;
    }
}