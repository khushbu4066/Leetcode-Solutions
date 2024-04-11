class Solution {
    public String removeKdigits(String s, int k) {
        
        if(k == 0) return s;
        
        if(k == s.length()) return "0";
        
        Stack<Character> st = new Stack<>();
        
        int n = s.length();
        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);
            
            while(!st.isEmpty() && k>0 && st.peek() > ch){
                st.pop();
                k--;
            }
            st.push(ch);
        }
        
        // Remove the remaining digits from the tail
        for(int i = 0; i<k; i++){
            st.pop();
        }
        
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        
        sb.reverse();
        //Removing the leading zeroes if any
        while(sb.length() > 1 && sb.charAt(0) == '0'){
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}