class Solution {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficient string manipulation
        int carry = 0;
        int i = a.length() - 1, j = b.length() - 1;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i--) - '0'; // Convert char to int by subtracting '0'
            }
            if (j >= 0) {
                sum += b.charAt(j--) - '0'; // Convert char to int by subtracting '0'
            }
            result.insert(0, sum % 2); // Insert the remainder at the beginning of the result string
            carry = sum / 2; // Update carry for the next iteration
        }
        
        return result.toString(); // Convert StringBuilder to String before returning
    }
}
