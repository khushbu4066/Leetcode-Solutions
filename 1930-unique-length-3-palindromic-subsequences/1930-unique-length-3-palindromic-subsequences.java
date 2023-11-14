class Solution {
    public int countPalindromicSubsequence(String s) {
        int result = 0;
        int n = s.length();

        for (char c = 'a'; c <= 'z'; c++) {
            int firstOccurrence = s.indexOf(c);
            int lastOccurrence = s.lastIndexOf(c);

            if (firstOccurrence != -1 && lastOccurrence != -1 && firstOccurrence < lastOccurrence) {
                Set<Character> uniqueChars = new HashSet<>();
                for (int i = firstOccurrence + 1; i < lastOccurrence; i++) {
                    uniqueChars.add(s.charAt(i));
                }
                result += uniqueChars.size();
            }
        }

        return result;
    }
}