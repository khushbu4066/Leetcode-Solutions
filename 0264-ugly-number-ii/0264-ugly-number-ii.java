
class Solution {
    public int nthUglyNumber(int n) {
        if (n <= 0) {
            return 0; // Or handle this case based on your requirements
        }

        List<Integer> uglyNumbers = new ArrayList<>();
        uglyNumbers.add(1); // 1 is the first ugly number
        int i2 = 0, i3 = 0, i5 = 0;

        while (uglyNumbers.size() < n) {
            int nextUgly = Math.min(Math.min(uglyNumbers.get(i2) * 2, uglyNumbers.get(i3) * 3), uglyNumbers.get(i5) * 5);
            uglyNumbers.add(nextUgly);

            if (nextUgly == uglyNumbers.get(i2) * 2) {
                i2++;
            }
            if (nextUgly == uglyNumbers.get(i3) * 3) {
                i3++;
            }
            if (nextUgly == uglyNumbers.get(i5) * 5) {
                i5++;
            }
        }

        return uglyNumbers.get(n - 1); // Return the nth ugly number
    }
}
