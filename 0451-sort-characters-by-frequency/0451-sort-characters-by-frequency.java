class Solution {
    public String frequencySort(String s) {
    
        //Count the occurance on each character
        HashMap<Character, Integer>mp = new HashMap<>();
        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        
        //Sorting
        List<Character> list = new ArrayList(mp.keySet());
        Collections.sort(list, (a, b) -> (mp.get(b) - mp.get(a)));
        
        
        //Build String
        StringBuilder sb = new StringBuilder();
        for(Object ch : list){
            for(int i = 0; i < mp.get(ch); i++){
                sb.append(ch);
            }
        }
        return sb.toString();
        
    }
}