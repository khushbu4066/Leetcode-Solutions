class Solution {
    public String largestGoodInteger(String num) {
        // Initialize maximum good integer to -1
        int maxi = -1;

        // Iterate through each substring of length 3
        for (int i = 0; i < num.length() - 2; i++) {
            // Check if the substring consists of only one unique digit
            if (num.charAt(i) == num.charAt(i + 1) && num.charAt(i + 1) == num.charAt(i + 2)) {
                // Convert the substring to an integer and update the maximum
                int digit = Integer.valueOf(num.substring(i, i + 3));
                maxi = Math.max(maxi, digit);
            }
        }

        // Return the result based on the maximum good integer found
        if (maxi == -1) {
            return ""; // No good integer found
        }
        if (maxi == 0) {
            return "000"; // Consider leading zeroes for 0
        }
        return String.valueOf(maxi);
    }
}