class Solution {
    public int superPow(int a, int[] b) {
        
        int result = 1;
        for(int digit : b){
            result = pow(result, 10) * pow(a, digit) % 1337;
        }
        return result;
       
    }
    
    public static int pow(int a, int b){
        a %= 1337;
        int result = 1;
        for(int i = 0; i<b; i++){
            result = (result * a) % 1337;
        }
        
        return result;
    }
}



   