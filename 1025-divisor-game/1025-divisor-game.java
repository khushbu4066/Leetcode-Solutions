class Solution {
    public boolean divisorGame(int n) {
        
        if(n <= 1) return false;
        if(n % 2 != 0) return false;
        
        return true;
    }
}