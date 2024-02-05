// class Solution {
//     public int firstUniqChar(String s) {
        
//          int n = s.length();
//         for(int i = 0; i<n; i++){
//             char count = 0;
//             for(int j = 0; j<n; j++){
//                 if(s.charAt(i)!=s.charAt(j)){
//                     count = 1;
//                     break;
//                     return i;
            
//                 }
//                 if(count == 0){
//                     return -1;
//                 }
//             }
//         }
//     }
// }

// Using char Array[26]


class Solution {
    public int firstUniqChar(String s) {
        
         int n = s.length();
        int arr[] = new int[26];
        
        for(char ch: s.toCharArray()){
            arr[ch - 'a']++;
        }
        
        for(int i = 0; i<n; i++){
            if(arr[s.charAt(i) - 'a'] == 1){
                return i;
            }
        }
        return -1;
    }
}
        
            
