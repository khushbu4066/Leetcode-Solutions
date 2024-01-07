
class Solution {
    public int mostFrequentEven(int[] arr) {
        int n = arr.length;
        HashMap<Integer, Integer> ans = new HashMap<>();

        for (int i = 0; i < n; i++) {
            ans.put(arr[i], ans.getOrDefault(arr[i], 0) + 1);
        }

        int maxFrequency = 0;
        int mostFrequentEven = -1;

        for (int j = 0; j < n; j++) {
            if (arr[j] % 2 == 0 && ans.get(arr[j]) >= maxFrequency) {
                if (ans.get(arr[j]) > maxFrequency || arr[j] < mostFrequentEven){
                maxFrequency = ans.get(arr[j]);
                mostFrequentEven = arr[j];
                }
            }
        }

        return mostFrequentEven;
    }
}
