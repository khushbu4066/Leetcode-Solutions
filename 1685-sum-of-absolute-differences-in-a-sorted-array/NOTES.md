​We have a **Sorted** integer Array in non-decreasing order and we are required to return an array such that for each element i in the result array, it equals to the **absolute difference** of element i in original array and all other elements.

First thought in our mind is **BruteForce** by looping with nested loop and each element we compute the absolute difference btw them and add it to our result[i].
But this solution takes O(N^2), which is not suitable for this problem and give us headache.

Since our array is sorted we can use these two cases to compute our objective so for each element we can use the **Sum** trick two times - which was invalid first but now are valid.

**First Time**, with all the elements **before** the current element since it is **greater** than them all and for this we can use **prefix** array to get immediately the sum of all elements **before** current element.

**Second Time**,with all the elements **after** the current element since it is **smaller** than them all and for this we can use **sufix** array to get immediately the sum of all elements **after** current element. 

**APPROACH**
1. **Initialization**: Obtain the size of the input array nums and create a result array of the same size.
2. 
**int n = nums.size();
vector<int> result(n);**

3. **Prefix and Suffix Sums**: Create two additional arrays, prefixSum and suffixSum, to store the cumulative sums from the beginning and end of the nums array, respectively. Initialize the first element of both arrays -Don't forget that the input array is sorted- .
4. 
**vector<int> prefixSum(n), suffixSum(n);**

**prefixSum[0] = nums[0];**

**suffixSum[n - 1] = nums[n - 1];**


6. **Calculate Sums in One Loop**: Use a single loop to calculate both the prefix and suffix sums simultaneously.
7. 
**for (int i = 1; i < n; ++i) {**

    **prefixSum[i] = prefixSum[i - 1] + nums[i];**
   
    **suffixSum[n - i - 1] = suffixSum[n - i] + nums[n - i - 1];
}**


9. **Calculate Absolute Differences**: Iterate through the array and compute the absolute differences using the prefix and suffix sums.
10. 
**for (int i = 0; i < n; ++i) {**

    **int currentAbsoluteDiff = ((nums[i] * i) - prefixSum[i]) + (suffixSum[i] - (nums[i] * (n - i - 1)));**
    
    **result[i] = currentAbsoluteDiff;
}**


12. **Return the calculated result array.**

13. 
**Complexity**

**Time complexity**: O(N)
Since we are looping over the input array two time, one time to calculate prefix and suffix arrays and another time to calculate the result which costs us 2 * N so time complexity is O(N).
Where N is the size of the input array.

**Space complexity**: O(N)
Since are storing two arrays of the same length of the input array which are the prefix and suffix arrays which costs us 2 * N so space complexity is O(N).
