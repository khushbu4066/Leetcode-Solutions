public class Solution {
  // you need to treat n as an unsigned value
  public int hammingWeight(int n) {
    var i = Integer.toUnsignedLong(n);
    var cnt = 0;
    
    while (i > 0) {
      cnt += i & 1;
      i >>= 1;
    }
    return cnt;
  }
}