class Solution {
    public String makeGood(String s) {
        
        StringBuilder result = new StringBuilder();
    // We can take stack<char> instead of result var
        
        for(char ch : s.toCharArray()){
            if (result.length() > 0 && (ch + 32 == result.charAt(result.length() - 1) || ch - 32 == result.charAt(result.length() - 1))){
                result.deleteCharAt(result.length()-1);
            }
            else{
                result.append(ch);
            }
        }
        return result.toString();
    }
}