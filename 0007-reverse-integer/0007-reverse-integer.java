class Solution {
    public int reverse(int x) {
        int revN = 0;
        
        while(x!=0){
            int ld = x%10;
            x = x/10;
            if( revN>Integer.MAX_VALUE/10 || revN<Integer.MIN_VALUE/10){
                return 0;
            }
            
            revN  = (revN*10)+ld;
        }
        
        return revN;
            
    }
}
