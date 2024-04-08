class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int len = students.length;
        
        Stack<Integer> st = new Stack<>();  // contains sanwitches
        Queue<Integer> q = new LinkedList<>();    // contains students
        
        for(int i = 0; i<len; i++){
            st.push(sandwiches[len - i - 1]);
            q.add(students[i]);
        }
        
        int lastServed = 0;
        while(!q.isEmpty() && lastServed < q.size()){
            if(st.peek() == q.peek()){
                st.pop();
                q.poll();
                lastServed = 0;
            }
            else{
                q.add(q.peek());
                q.poll();
                lastServed++;
            }
        }
        return q.size();
    }
}