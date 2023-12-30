class Solution {
    public boolean makeEqual(String[] words) {
        
        int n = words.length;
        
        HashMap<Character, Integer> count = new HashMap<>();
        
        for(String word: words){
            for(char ch: word.toCharArray()){
                count.put(ch, count.getOrDefault(ch,0)+1);
            }
        }
        for(int value: count.values()){
            if(value%n != 0){
                return false;
            }
        }
        return true;
    }
}