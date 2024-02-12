// class Solution {
//     public int majorityElement(int[] arr) {   
			
//         for(int i = 0; i<arr.length; i++){
//             int count = 1;
//             for(int j = i+1; j<arr.length; j++){
//                 if(arr[i] == arr[j]){
//                     count++;
//                 }
//             }
//             if(count > arr.length/2){
//                 return arr[i];
//             }
//         }
//         return -1;
        
//     }
// }
// O(n*n) which is note an opptimal solution

// class Solution {
//     public int majorityElement(int[] arr) {   
        
//         int n = arr.length;
//         HashMap<Integer, Integer> ans = new HashMap<>();
        
//         for(int i = 0; i<n; i++){
//             ans.put(arr[i],ans.getOrDefault(arr[i],0)+1);
//         }
        
//         int c = -1;
//         for(int j = 0; j<n; j++){
//             if(ans.get(arr[j]) > n/2){
//                 c = arr[j];
//             }
//         }
//         return c;
//     }
// }

class Solution {
    public int majorityElement(int[] arr) {   
        
        int n = arr.length;
        
       for(int i = 0; i<n; i++){
           int count = 1;
           for(int j = i + 1; j<n; j++){
               if(arr[i] == arr[j]){
                   count++;
               }
           }
           if(count > n/2){
               return arr[i];
           }
       }
    
        return -1;
    }
}