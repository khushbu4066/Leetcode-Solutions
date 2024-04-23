
class Solution {
    public int countDigits(int num) {
        int divisible = 0;
        int x = num;

        while(x>0) {
            int r = x%10;
            x = x/10;
            if(num%r == 0) {
                divisible++;
            }
        }
        return divisible;
    }
}