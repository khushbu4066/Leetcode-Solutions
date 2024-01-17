// class Solution {
//     public boolean uniqueOccurrences(int[] arr) {
        
//         HashMap<Integer, Integer> map = new HashMap<>();
        
//         for(int num: arr){
//             map.put(num, map.getOrDefault(num,0)+1);
//         }
        
//         HashSet<Integer> set = new HashSet<>();
//         for(int freq : map.values()){
//             if(set.contains(freq)){
//                 return false;
//             }
//             set.add(freq);
//         }
//         return true;
//     }
// }

class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        
        int[] vec = new int[2001];
        
        for(int num: arr){
            vec[num + 1000]++;
        }
        
        Arrays.sort(vec);
        
        for(int i = 1; i<2001; i++){
            if(vec[i] != 0 && vec[i]==vec[i-1]){
                return false;
            }
        }
        return true;
    }
}