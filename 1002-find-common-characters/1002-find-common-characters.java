class Solution {
    public List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        int [][] mp = new int[26][words.length];
        int index = 0;
        for(String s : words) {
            for(char c : s.toCharArray()) {
                int charIndex = c - 'a';
                mp[charIndex][index]++;
            }
            index++;
        }

        for(char c : words[0].toCharArray()) {
            int charIndex = c - 'a';
            int [] row = mp[charIndex];
            boolean found = true;
            for(int i = 0 ; i < row.length ; i++) {
                if(row[i] == 0) {
                    found = false;
                    break;
                }
                row[i]--;
            }

            if(found) {
                res.add(String.valueOf(c));
            }
        }
        return res;
    }
}