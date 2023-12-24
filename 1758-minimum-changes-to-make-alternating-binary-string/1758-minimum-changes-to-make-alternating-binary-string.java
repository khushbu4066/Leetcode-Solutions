//Approach-1 (String can start from 0, string can start from 1)
//T.C : O(n)
//S.C : O(n)
public class Solution {
    public int minOperations(String s) {
//         int n = s.length();
//         int start_with_0 = 0;
//         int start_with_1 = 0;

//         // 010101
//         // 101010
//         for (int i = 0; i < n; i++) {
//             if (i % 2 == 0) {
//                 if (s.charAt(i) == '0') {
//                     start_with_1++;
//                 } else {
//                     start_with_0++;
//                 }
//             } else {
//                 if (s.charAt(i) == '1') {
//                     start_with_1++;
//                 } else {
//                     start_with_0++;
//                 }
//             }
//         }

//         return Math.min(start_with_0, start_with_1);
        
        
        
        int n = s.length();
        int start_with_0 = 0; //010101
        
        for(int i = 0; i<n; i++){
            if(i%2==0){
                if(s.charAt(i)=='0'){
                    start_with_0++;                
                }
            }
            else{
                if(s.charAt(i)=='1'){
                    start_with_0++;
                }
            }
        }
        int start_with_1 = n - start_with_0;
        return Math.min(start_with_0, start_with_1);
    }
}
