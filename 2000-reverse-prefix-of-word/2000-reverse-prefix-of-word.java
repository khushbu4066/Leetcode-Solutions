// class Solution {
//     public String reversePrefix(String word, char ch) {
        
//         int i = 0;
//         int j = word.indexOf(ch);
        
//         char[] chars = word.toCharArray();
//         while(i < j){
//             char temp = chars[i];
//             chars[i] = chars[j];
//             chars[j] = temp;
//             i++;
//             j--;
//         }
//         return new String(chars);
//     }
// }

class Solution {
    public String reversePrefix(String word, char ch) {
        
        int index = word.indexOf(ch);
        
        if(index != -1){
            return new StringBuilder(word.substring(0, index+1)).reverse().toString() + word.substring(index + 1);
        }
        
        return word;
    }
}



