class Solution {
    public List<List<String>> partition(String s) {
         return util1(s);
    }
    List<List<String>> ans;

    public List<List<String>> util1(String str) {
        ans = new ArrayList<>();
        helper(str, 0, new ArrayList<String>());
        return ans;
    }

    public void helper(String str, int index, List<String> tillNow) {
        if (index == str.length()) {
            ans.add(new ArrayList<>(tillNow));
            return;
        }
        for (int i = index; i < str.length(); i++) {
            if (isPal(str, index, i)) {
                tillNow.add(str.substring(index, i + 1));
                helper(str, i + 1, tillNow);
                tillNow.remove(tillNow.size() - 1);
            }
        }
    }

    public boolean isPal(String str, int i, int j) {
        while (i <= j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;   
    }
}