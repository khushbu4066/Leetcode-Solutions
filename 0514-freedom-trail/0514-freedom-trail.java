class Solution {
    private int dp[][][];
    public int findRotateSteps(String ring, String key) {
        dp = new int[ring.length()][key.length()][2];
        for(int temp[][] : dp){
            for(int temp1[] : temp)Arrays.fill(temp1,-1);
        }
        return Math.min(getMinRotateStep(ring,key,0,0,0) ,getMinRotateStep(ring,key,0,1,0));
    }
    public int getMinRotateStep(String ring ,String key ,int i ,int flag ,int j){
        if( j == key.length())return 0;
        if(dp[i][j][flag] != -1) return dp[i][j][flag];
        if(ring.charAt(i) == key.charAt(j)){
            return  dp[i][j][flag] = 1 + Math.min(  getMinRotateStep(ring ,key , i  ,0 , j+1) ,
                             getMinRotateStep(ring ,key , i ,1 , j+1));
        }else{
            if(flag == 0){
                return dp[i][j][flag] =  1 + getMinRotateStep(ring ,key , (i + 1) % ring.length(), flag, j);
            }else{
                return dp[i][j][flag] = 1 + getMinRotateStep(ring ,key , i - 1 < 0 ? ring.length() - 1 : i -1 ,flag , j) ;
            }
        }
    }
}