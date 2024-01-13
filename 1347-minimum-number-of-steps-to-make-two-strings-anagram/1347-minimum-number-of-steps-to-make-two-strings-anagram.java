// class Solution {
//     public int minSteps(String s, String t) {
        
//         int n = s.length();
//         int[] ans_s = new int[26];
//         int[] ans_t = new int[26];
        
//         for(int i = 0; i<n; i++){
//             ans_s[s.charAt(i)-'a']++;
//             ans_t[t.charAt(i)-'a']++;
//         }
//         int result = 0;
        
//         for(int i = 0; i<26; i++){
            
//             int freqOfS = ans_s[i];
//             int freqOfT = ans_t[i];
            
//             if(freqOfT < freqOfS){
//                 result += freqOfS - freqOfT;
//             }
//         }
            
//             return result;
//     }
// }

class Solution {
    public int minSteps(String s, String t) {
        
        int n = s.length();
        int[] ans = new int[26];
        
        for(int i = 0; i<n; i++){
            ans[s.charAt(i)-'a']++;
            ans[t.charAt(i)-'a']--;
        }
        int result = 0;
        
        for(int i = 0; i<26; i++){
            result += Math.max(0, ans[i]);
        }
            
            return result;
    }
}