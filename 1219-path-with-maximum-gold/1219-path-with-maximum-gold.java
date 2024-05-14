class Solution {
    // Define arrays for movement directions: up, down, left, right
    int[] roww = {1, -1, 0, 0};
    int[] coll = {0, 0, -1, 1};
    int maxGold = 0; // Initialize the variable to store the maximum gold collected

    // Depth-first search function to explore paths and collect gold
    public int dfs(int[][] grid, int x, int y, int n, int m) {
        // Base case: if the current cell is out of bounds or has no gold, return 0
        if (x < 0 || x >= n || y < 0 || y >= m || grid[x][y] == 0) return 0;
        
        int curr = grid[x][y]; // Store the current amount of gold in the cell
        grid[x][y] = 0; // Mark the current cell as visited (set gold to 0)
        int localMaxGold = curr; // Initialize the local maximum gold with the current cell's gold

        // Explore adjacent cells (up, down, left, right) and collect gold recursively
        for (int i = 0; i < 4; i++) {
            int newX = x + roww[i]; // Calculate the new x-coordinate
            int newY = y + coll[i]; // Calculate the new y-coordinate
            // Update the local maximum gold with the maximum gold collected from adjacent cells
            localMaxGold = Math.max(localMaxGold, curr + dfs(grid, newX, newY, n, m));
        }

        grid[x][y] = curr; // Restore the original amount of gold in the current cell
        return localMaxGold; // Return the local maximum gold collected from this path
    }

    // Main function to find the maximum amount of gold that can be collected
    public int getMaximumGold(int[][] grid) {
        int n = grid.length; // Get the number of rows
        int m = grid[0].length; // Get the number of columns

        // Iterate through each cell in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                // If the cell contains gold, explore paths and update the maximum gold collected
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, dfs(grid, i, j, n, m));
                }
            }
        }

        return maxGold; // Return the maximum gold collected
    }
}
