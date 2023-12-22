class Solution {
    public int maxScore(String s) {
        
//         int result = Integer.MIN_VALUE;
//         int n = s.length();
        
//         for(int i = 0; i<=n-2; i++){
            
//             int count_zero = 0;
            
//             // 0 to i zero count
//             for(int j = 0; j<=i; j++){
//                 if(s.charAt(j) == '0'){
//                     count_zero++;
//                 }
//             }
            
//             // i+1 to n-2 one count
//             int count_one = 0;
//             for(int j = i+1; j<n; j++){
//                 if(s.charAt(j) =='1'){
//                     count_one++;
//                 }
//             }
//             result = Math.max(result, count_zero+count_one);
//         }
//         return result;
        //O(n*n)
        
        
        // 2 pass approach
        int n = s.length();
        int score = Integer.MIN_VALUE;
        int ones = 0;
        int zeros = 0;
        
        for(int  i = 0; i<=n-2; i++){
            if(s.charAt(i)=='1'){
                ones++;
            }
            else
                zeros++;
            
            score = Math.max(score, zeros-ones);
            
            
            
        }
        if(s.charAt(n-1) == '1'){
            ones++;
        }
        return score+ones;
    }
}