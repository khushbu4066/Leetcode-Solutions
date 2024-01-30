class Solution {
    
    int Operate(int a, int b, String s){
        
        if(s.equals("+"))
            return a+b;
        
        if(s.equals("-"))
            return a-b;
        
        if(s.equals("*"))
            return (int)((long)a*(long)b);
        
        if(s.equals("/"))
            return a/b;
        
        return -1;
        
    }
    
    public int evalRPN(String[] tokens) {
        Stack<Integer>st = new Stack<>();
        
        for(String s:tokens){
            if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
                
                //Top2 element ko POP karna h
                // and resultant ko push
                
                int b = st.pop();
                int a = st.pop();
                
                
                int result = Operate(a, b, s);
                st.push(result);
            }
            else{
                st.push(Integer.parseInt(s));
            }
        }
        return st.pop();
    }
}