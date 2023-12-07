class Solution {
    public String largestOddNumber(String n) {
        
        int res = -1;
        int len = n.length();

        for(int i = 0; i<len; i++){
            char digit = n.charAt(i);
            
            int num = digit - '0';
            
            if(num % 2 != 0){
            res = i;
        }
    }
        if(res==-1){
            return "";
        }
        
        return n.substring(0, res+1);
        
    }
}
