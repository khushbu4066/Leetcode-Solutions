class Solution {
    public int strStr(String s1, String s2) {
        // return s1.indexOf(s2);
        
        int n = s1.length();
        int m = s2.length();
        
        for(int i = 0; i<=n-m; i++){
            for(int j = 0; j<m; j++){
                if(s1.charAt(i+j) != s2.charAt(j)){
                    break;
                }
                if(j == m-1){
                return i;
                }
            }
        }
        return -1;
    }
}