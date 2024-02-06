//Approach-1 (Using Sorting)
//T.C : O(n*klog(k))  (n = size of input, k = maximum length of a string in the input vector)
//S.C : O(n*k)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str : strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = new String(charArray);

            if (!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}


//Approach-2
//T.C : O(n*k)  (n = size of input, k = maximum length of a string in the input vector)
//S.C : O(n*k)
// class Solution {
//     private String generate(String s) {
//         int[] count = new int[26];

//         for (char ch : s.toCharArray()) {
//             count[ch - 'a']++;
//         }

//         StringBuilder newS = new StringBuilder();

//         for (int i = 0; i < 26; i++) {
//             if (count[i] > 0) {
//                 newS.append(String.valueOf((char) (i + 'a')).repeat(count[i]));
//             }
//         }

//         return newS.toString();
//     }

//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();

//         for (String s : strs) {
//             String newS = generate(s);

//             if (!map.containsKey(newS)) {
//                 map.put(newS, new ArrayList<>());
//             }

//             map.get(newS).add(s);
//         }

//         return new ArrayList<>(map.values());
//     }
// }