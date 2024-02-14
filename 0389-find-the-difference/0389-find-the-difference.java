class Solution {
    public char findTheDifference(String s, String t) {
        // char c = 0;
        // for(char cs : s.toCharArray()) c ^= cs;
        // for(char ct : t.toCharArray()) c ^= ct;
        // return c;
        
        //Approach-1
        
        HashMap<Character, Integer> mp = new HashMap<>();
        
        for(char ch : s.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch,0)+1);
        }
        
        for(char ch : t.toCharArray()){
            mp.put(ch, mp.getOrDefault(ch, 0)-1);
    
           
        
        if(mp.get(ch) < 0){
            return ch;
        }
        }
        return 'x';
    }
}