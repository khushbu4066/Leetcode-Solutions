class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        
        Map<Integer, Integer> map = new HashMap<>();
        for (int item: arr1) map.put(item, map.getOrDefault(item, 0) + 1);
        int[] res = new int[arr1.length];
        int it = 0;
        for (int i = 0; i < arr2.length; ++i) {
            for (int j = 0; j < map.get(arr2[i]); ++j) {
                res[it] = arr2[i];
                ++it;
            }
            map.remove(arr2[i]);
        }
        int startIndex = it;
        for (Map.Entry<Integer, Integer> entry: map.entrySet()) {
            for (int i = 0; i < entry.getValue(); ++i) {
                res[it] = entry.getKey();
                ++it;
            }
        }
        Arrays.sort(res, startIndex, arr1.length);
        return res;
    }
}