class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        Map<Integer, Integer> map = new HashMap<>();
        int j = 0;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(s.charAt(i) - t.charAt(i));
            while (j<=i && maxCost < diff) {
                maxCost += map.getOrDefault(j,0);
                map.remove(j);
                j++;
            }
            if(j>i){
                 continue ;
            }
            maxCost -= diff;
            map.put(i, diff);
            ans = Math.max(ans, i-j + 1);
        }
        return ans;
    }
}