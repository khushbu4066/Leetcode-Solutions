class Solution {
    public boolean isPathCrossing(String path) {
        
        
        //Created set for visited cordinates
        Set<String> set = new HashSet<>();
        
        //Initial posotion (0,0)
        int x = 0;
        int y = 0;
    
        String key = x+"_"+y; // Creating String representation of the current cordinates
        set.add(key);
        
        
        //Iterate through each character of the input path
        for(char ch : path.toCharArray()){
            if(ch=='E'){
                x++;
            }
            else if(ch=='W'){
                x--;
            }
            else if(ch=='N'){
                y++;
            }
            else{
                y--;
            }
            key = x+"_"+y;
            if(set.contains(key))
            {
                return true;
            }
            set.add(key);
        }
        return false;
    }
}

/*

Let's consider an example path "NESW":

Initial position: (0,0). The set now contains the key "0_0".
Move 'N': (0,1). The set now contains the key "0_1".
Move 'E': (1,1). The set now contains the key "1_1".
Move 'S': (1,0). The set now contains the key "1_0".
Move 'W': (0,0). The set already contains the key "0_0", indicating a self-crossing. The function returns true.
In this example, the path "NESW" forms a loop and crosses itself at the starting point (0,0) after completing all four moves. Therefore, the function returns true
*/