// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//         char arr1[]=s.toCharArray();
//         char arr2[]=t.toCharArray();
//         Arrays.sort(arr1);
//         Arrays.sort(arr2);
//         for(int i=0;i<arr1.length;i++){
//             if(arr1[i]!=arr2[i]){
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer>mp = new HashMap<>();
        
        for(int i = 0; i<s.length(); i++){
            if(mp.containsKey(s.charAt(i))){
                mp.put(s.charAt(i), mp.put(s.charAt(i),0)+1);
            }
            else{
                mp.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i<t.length(); i++){
            if(mp.containsKey(t.charAt(i))){
                mp.put(t.charAt(i), mp.get(t.charAt(i))-1);
                
            }
            else{
                return false;
            }
            
        }
       Set<Character> keys = mp.keySet();
        // Loop over all keys and check if all keys are 0.
        // If so it means it is anagram.
        for (Character key : keys) {
            if (mp.get(key) != 0) {
                return false;
            }
        }
        // Returning True as all keys are zero
        return true;
    }
}