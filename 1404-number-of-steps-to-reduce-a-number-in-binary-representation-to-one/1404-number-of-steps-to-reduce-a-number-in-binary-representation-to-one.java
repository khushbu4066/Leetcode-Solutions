import java.math.BigInteger;

class Solution {
    public int numSteps(String s) {
        BigInteger num = new BigInteger(s, 2);
        BigInteger one = new BigInteger("1");
        BigInteger zero = new BigInteger("0");
        int cnt = 0;
        
        while (!num.equals(one)) {
            if (num.mod(new BigInteger("2")).equals(zero)) {
                num = num.divide(new BigInteger("2"));
            } else {
                num = num.add(one);
            }
            cnt++;
        }
        
        return cnt;
    }
}