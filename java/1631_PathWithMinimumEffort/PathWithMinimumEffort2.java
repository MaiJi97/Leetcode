class Solution {
    
    int[][] directions = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
    
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        int[][] effort = new int[m][n];

        for (int[] nums : effort) {
            Arrays.fill(nums, Integer.MAX_VALUE);
        }
        effort[0][0] = 0;
        dfs(heights, 0, 0, effort);
        
        return effort[m-1][n-1] == Integer.MAX_VALUE ? -1 : effort[m-1][n-1];
    } 
    
    public void dfs(int[][] heights, int row, int col, int[][] effort) {
        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];
            if (newRow < 0 || newRow >= heights.length || newCol < 0 || newCol >= heights[0].length) {
                continue;
            }
            int difference = Math.abs(heights[newRow][newCol]-heights[row][col]);
            int newEffort = Math.max(effort[row][col], difference);
            if (newEffort < effort[newRow][newCol]) {
                effort[newRow][newCol] = newEffort;
                dfs(heights, newRow, newCol, effort);
            }
        }
    }
}
