In this program we need to provide the solution to simulate the scenario by calculation the time each monster takes to reach the city. based on it's initial distance and speed. By sorting these, program identifies how many monster can be eliminated before any of them reach the city.

**Approach:**

1. The program calculates the time each monster takes to reach the city by dividing its distance by its speed.
2. It sorts these times to know the order in which the monsters will reach the city.
3. It then checks how many monsters can be eliminated before any one of them reaches the city by comparing the time each monster takes to reach with its index (i.e., the minute number).

**Complexity:**

**Time Complexity:**
• Calculating the time taken by each monster: O(n), where n is the number of monsters.
• Sorting the array of times: O(n log n), due to sorting.
• Looping through the sorted array to determine the number of monsters to eliminate: O(n).
• Overall time complexity: O(n log n) dominated by the sorting operation.

**Space complexity:**
Apart from the input arrays, the program uses an additional array of size n to store the time taken by each monster. Thus, the space complexity is O(n) due to this auxiliary array.​
