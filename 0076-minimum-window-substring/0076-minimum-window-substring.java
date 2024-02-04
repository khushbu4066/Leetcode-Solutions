class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        if (t.length() > n) {
            return "";
        }

        Map<Character, Integer> mp = new HashMap<>(); // Use Map for clarity

        // Store character frequencies from t in the map
        for (char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int requiredCount = mp.size(); // Number of distinct characters needed
        int i = 0, j = 0;

        int windowSize = Integer.MAX_VALUE;
        int start_i = 0;

        while (j < n) {
            char ch = s.charAt(j);

            // Decrement count for the current character in the map
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) - 1);
                if (mp.get(ch) == 0) { // Character fully fulfilled
                    requiredCount--;
                }
            }

            // Minimize window as long as all characters are included
            while (requiredCount == 0) {
                int currWindowSize = j - i + 1;
                if (windowSize > currWindowSize) {
                    windowSize = currWindowSize;
                    start_i = i;
                }

                char leftChar = s.charAt(i);
                // Increment count for the character being removed
                if (mp.containsKey(leftChar)) {
                    mp.put(leftChar, mp.get(leftChar) + 1);
                    if (mp.get(leftChar) > 0) { // Character no longer fulfilled
                        requiredCount++;
                    }
                }
                i++;
            }
            j++;
        }

        return windowSize == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i + windowSize);
    }
}
