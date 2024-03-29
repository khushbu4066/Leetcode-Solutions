// BruteForce approach

// class Solution {
//     public int longestCommonSubsequence(String t1, String t2) {
        
//         int n1 = t1.length();
//         int n2 = t2.length();
//         int count = 0;
        
//         for(int i = 0; i<n1; i++){
//             for(int j = 0; j<n2; j++){
//                 if(t1.charAt(i) == t2.charAt(j)){
//                     count++;
//                 }
//             }
//         }
//         return count;
//     }
// }

// Better 
class Solution {
    int dp[][]=new int[1000+1][1000+1] ;
    public int longestCommonSubsequence(String a, String b) {
        int l1=a.length(),l2=b.length();
        
        for(int i=0;i<=l1;i++)
        dp[i][0]=0;
        
        for(int i=0;i<=l2;i++)
        dp[0][i]=0;
        
        for(int i=1;i<=l1;i++)
        {
            for(int j=1;j<=l2;j++)
            {
                if(a.charAt(i-1)==b.charAt(j-1))
                dp[i][j]=1+dp[i-1][j-1];
                
                else dp[i][j]=Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[l1][l2];
    }
};