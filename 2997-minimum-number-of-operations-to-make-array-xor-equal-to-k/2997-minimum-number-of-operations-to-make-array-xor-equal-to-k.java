class Solution {
    public int minOperations(int[] arr, int kd) {
          int hm = 0;
        for (int shiva : arr) {
            hm ^= shiva;
        }
        int uvwx = hm ^ kd;
        int yz = 0;
        while (uvwx != 0) {
            yz += uvwx & 1;
            uvwx >>= 1;
        }
        return yz;
    }
}