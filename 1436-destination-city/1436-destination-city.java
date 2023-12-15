class Solution {
    public String destCity(List<List<String>> paths) {
        
        HashMap<String,String> map = new HashMap<>();
        
        for(List<String> inner : paths)
            
        {
            for(int i=0; i<inner.size()-1; i++)
            {
                map.put(inner.get(i),inner.get(i+1));
            }
        }
        
        // Iterate through the values and find the destination city
        
        
        for (String destination : map.values()) {
            
            if (!map.containsKey(destination)) {
                
                // If the destination city is not a starting city, return it
                return destination;
            }
        }

        // If all values are also keys, it means there is no destination city that is not a starting city
        
        return "";
    }
}