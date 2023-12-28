class Solution {
    public int compress(char[] chars) {
        
        int n = chars.length;
        int idx = 0;
        int i = 0;
        
        while(i<n){
            char cur = chars[i];
            
            int count = 0;
            
            // Count for the duplicate chars
            while(i<n && cur == chars[i]){
                i++;
                count++;
            }
                
                chars[idx++] = cur;  // Assign it to chars and move towards count
                
                // Adding  the count 
                if(count > 1){
                    String countStr = Integer.toString(count);
                    
                    for(char x : countStr.toCharArray()){
                        chars[idx++] = x;
                    }
                }
        }
        return idx;
    }
}