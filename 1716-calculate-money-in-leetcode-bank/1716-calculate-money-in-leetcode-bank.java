class Solution {
    public int totalMoney(int n) {
        int totalAmount = 0;
        int currDay = 1;
         
        for(int i = 1; i <= n; i++){
            
            totalAmount += currDay;
            currDay++;
            
            if(i%7 == 0){
                currDay = (i/7)+1;
            }
        }
        
        return totalAmount;
        
    }
}