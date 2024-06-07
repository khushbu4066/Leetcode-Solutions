class Solution {
    public String replaceWords(List<String> d, String sentence) {
        StringBuilder ans = new StringBuilder();
        String[] words = sentence.split("\\s+");
        for (String w : words) {
            String prefix = null;
            for (String root : d) {
                if (w.startsWith(root)) {
                    if (prefix == null || root.length() < prefix.length()) {
                        prefix = root;
                    }
                }
            }
            if (prefix != null) {
                ans.append(prefix);
            } else {
                ans.append(w);
            }
            ans.append(" ");
        }
        if (ans.length() > 0 && ans.charAt(ans.length() - 1) == ' ') {
            ans.deleteCharAt(ans.length() - 1);
        }
        return ans.toString();
    }
}