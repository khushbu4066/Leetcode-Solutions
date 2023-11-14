In this problem we need to iterate over each unique character in the input string, find its first and last occurrences, and then count the unique characters between them. This count represents the number of palindromic subsequences of length 3 for that particular character.

**Steps:**
Iterate over each character in the range from ‘a’ to ‘z’.

For each character, find its first and last occurrences in the input string.

If both occurrences exist and are different, calculate the count of unique characters between them.

Accumulate this count for all characters.

Return the total count as the result.

**Time complexity:**

Let n be the length of the input string.

• The outer loop runs for a constant number of characters (‘a’ to ‘z’), so it is O(1).

• Inside the loop, indexOf and lastIndexOf operations take O(n) time in the worst case.

• The inner loop iterates over a subset of characters between the first and last occurrences, taking O(n) time in the worst case.

• Overall, the time complexity is O(26 * n) ≈ O(n) since the constant factor is dropped.

**Space complexity:**

The space complexity is O(1) because the extra space used (Set) is not dependent on the input size; it only holds a constant number of unique characters.​
