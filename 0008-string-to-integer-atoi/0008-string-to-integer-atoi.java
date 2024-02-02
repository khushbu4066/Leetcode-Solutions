class Solution {
    public int myAtoi(String s) {
        
        if(s==null) return 0;
        
        s = s.trim();
        
        if(s.length()==0) return 0;
        
        int sign = +1;
        long res = 0;
        if(s.charAt(0)=='-') sign = -1;
        
        int MAX = Integer.MAX_VALUE, MIN = Integer.MIN_VALUE;
        int i = (s.charAt(0)=='+' || s.charAt(0)=='-') ? 1 : 0;
        
        while(i<s.length()){
            if(s.charAt(i)==' ' || !Character.isDigit(s.charAt(i))) break;
            res = res * 10 + s.charAt(i) - '0';
            
            //check condition
            if(sign == -1 && -1*res < MIN) return MIN;
            if(sign == 1 && res > MAX) return MAX;
            i++;
        }
        return (int)(sign*res);
    }
}