// Here we are taking digits as n
class Solution {
    public int[] plusOne(int[] n) {
        for(int i = n.length-1; i>=0; i--){
                if(n[i] < 9){
                    n[i]++;
                    return n;
                }
            n[i] = 0;
        }
        
        n = new int[n.length + 1];
        n[0] = 1;
        return n;
    }
}