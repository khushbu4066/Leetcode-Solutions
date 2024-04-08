// class Solution {
//     public int countStudents(int[] students, int[] sandwiches) {
        
//         int len = students.length;
        
//         Stack<Integer> st = new Stack<>();  // contains sanwitches
//         Queue<Integer> q = new LinkedList<>();    // contains students
        
//         for(int i = 0; i<len; i++){
//             st.push(sandwiches[len - i - 1]);
//             q.add(students[i]);
//         }
        
//         int lastServed = 0;
//         while(!q.isEmpty() && lastServed < q.size()){
//             if(st.peek() == q.peek()){
//                 st.pop();
//                 q.poll();
//                 lastServed = 0;
//             }
//             else{
//                 q.add(q.peek());
//                 q.poll();
//                 lastServed++;
//             }
//         }
//         return q.size();
//     }
// }
//TC = O(n)
// SC = o(n)


class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        
        int n = students.length;
        int[] arr = new int[2];
        
        for(int x : students){
            arr[x]++;
        }
        
        for(int i = 0; i<n; i++){
            if(arr[sandwiches[i]] == 0) return n-i;
            arr[sandwiches[i]]--;
        }
        return 0;
    }
}