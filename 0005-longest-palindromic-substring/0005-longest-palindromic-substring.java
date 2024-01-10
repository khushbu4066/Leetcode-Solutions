class Solution {
    public String longestPalindrome(String S) {
        
        int len = S.length();
        if(len == 0||len==1) return S;
        String ans = Character.toString(S.charAt(0));
        for(int i = 0; i<len; i++){
            for(int j = len-1; j>i; j--){
                if((j-i)+1<=ans.length()) break;
                if(S.charAt(i) == S.charAt(j)){
                    if(isPalindrome(S,i,j)){
                        if((j-i)+1>ans.length()){
                            ans = S.substring(i, j+1);
                        }
                    }
                }
            }
        }
        return ans;
        
    }
    public static boolean isPalindrome(String str, int s, int e){
        while(s<e){
            if(str.charAt(s)!= str.charAt(e)) return false;
            s++;
            e--;
        }
        return true;
       
    }
}