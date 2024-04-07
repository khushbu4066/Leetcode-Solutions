// class Solution {
//     public int totalMoney(int n) {
//         int totalAmount = 0;
//         int currDay = 1;
         
//         for(int i = 1; i <= n; i++){
            
//             totalAmount += currDay;
//             currDay++;
            
//             if(i%7 == 0){
//                 currDay = (i/7)+1;
//             }
//         }
        
//         return totalAmount;
        
//     }
// }

class Solution {
    public int totalMoney(int n) {
        
        int TA = 0;
        int currday = 1;
        for(int i = 1; i<=n; i++){
            TA += currday;
            currday++;
            
            if(i%7 == 0){
                currday = (i/7) + 1;
            }
        }
        return TA;
        
    }
}