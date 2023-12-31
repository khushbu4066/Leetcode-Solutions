class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        
//        int n = s.length();
//         int result = -1;
        
//         for(int i = 0; i<n; i++){
//             for(int j = i+1; j<n; j++){
//                 if(s.charAt(i)==s.charAt(j)){
//                 result = Math.max(result, j-i-1);
//                 }
//             }
//         }
//         return result;
        
        // TC = O(n^2)
        // SC = O(1)
        
        int n = s.length();
        int result = -1;
        HashMap<Character, Integer> mp = new HashMap<>();

        

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (!mp.containsKey(ch)) {
                mp.put(ch, i);
            } else {
                result = Math.max(result, i - mp.get(ch) - 1);
            }
        }

        return result;
    }
}
// TC = O(n)
// SC = O(n)


