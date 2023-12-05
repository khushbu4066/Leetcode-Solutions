// class Solution {
//     public int numberOfMatches(int n) {
//         int m = 0;
//         while(n>1){
//             if(n%2 == 0){
//                 m+=n/2;
//                 n/=2;
//             } else{
//                 m+=(n-1)/2;
//                 n = ((n-1)/2)+1;
                
//             }
//         }
        
//        return m; 
//     }
// }

//time complexity = O(logn)

class Solution{
    public int numberOfMatches(int n){
        
        int m = 0;
        
        while(n>1){
            
            m+=n/2;
            n=(n+1)/2;
        }
        return m;
    }
}