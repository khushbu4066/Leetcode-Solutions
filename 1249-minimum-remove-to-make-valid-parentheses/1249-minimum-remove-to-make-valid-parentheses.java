class Solution {
    public String minRemoveToMakeValid(String s) {

        int n = s.length();
        
        Stack<Integer>st = new Stack<>();
        HashSet<Integer> remove_bracket = new HashSet<>();
        
        for(int i = 0; i<n; i++){
            if(s.charAt(i) == '('){
                st.push(i);
            }
            else if(s.charAt(i) == ')'){
                if(st.empty()){
                    remove_bracket.add(i);
                }
                else{
                    st.pop();
                }
            }
        }
        
        // if st have only "( ( (" 
        while(!st.empty()){
            remove_bracket.add(st.pop());
        }
        
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<n; i++){
            if(!remove_bracket.contains(i)){
                result.append(s.charAt(i));
            }
        }
        return result.toString();
    }
}