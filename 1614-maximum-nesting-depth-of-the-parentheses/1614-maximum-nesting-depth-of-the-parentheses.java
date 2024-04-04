class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        
        int result = 0;
        
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch);
            }
            else if(ch == ')'){
                st.pop();
            }
            
            result = Math.max(result, st.size());
        }
        return result;
    }
}