class Solution {
    public String minRemoveToMakeValid(String s) {
        int n = s.length();
        
        HashSet<Integer> toRemove = new HashSet<>();
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if(ch == '(') 
                st.push(i);
            else if(ch == ')') {
                if(st.isEmpty()) 
                    toRemove.add(i);
                else 
                    st.pop();
            }
        }
        
        while(!st.isEmpty()) 
            toRemove.add(st.pop());
        
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < n; i++) {
            if(!toRemove.contains(i))
                result.append(s.charAt(i));
        }
        
        return result.toString();
    }
}