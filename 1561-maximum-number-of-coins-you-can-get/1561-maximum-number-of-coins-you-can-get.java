class Solution {
    public int maxCoins(int[] piles) {
        
        Arrays.sort(piles);
        int sum = 0;
        int i = 0;   //start index
        int j = piles.length-1;  //end index
        
        while(i<j){
            sum+=piles[j-1];
            j= j-2;
            i++;
        }
        return sum;
    }
}