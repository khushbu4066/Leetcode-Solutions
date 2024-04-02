class Solution {
    public boolean checkIfPangram(String s) {
        
        boolean[] mark = new boolean[26];
        int index = 0;
        
        for(int i = 0; i<s.length(); i++){
            if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
                index = s.charAt(i) - 'A';
            }
            else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
                index = s.charAt(i) - 'a';
            }
            else
                continue;
                mark[index] = true;
            
        }
        
        for(int i = 0; i<=25; i++){
            if(mark[i] == false)
            return false;
        }
        
        return true;
        
    }
}