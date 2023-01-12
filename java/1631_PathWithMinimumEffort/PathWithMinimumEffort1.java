class Solution {
    int[][] directions = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};

    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        if (m == 1 && n == 1) {
            return 0;
        }
        int[][] effort = new int[m][n];
        for (int[] row : effort) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
    
        // Queue<int[]> queue = new ArrayDeque<>();
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((n1, n2) -> (n1[2]-n2[2]));
        queue.offer(new int[]{0, 0, 0});
        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            for (int[] direction : directions) {
                int newRow = current[0] + direction[0];
                int newCol = current[1] + direction[1];
                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) {
                    continue;
                }
                int newEffort = Math.max(current[2], Math.abs(heights[newRow][newCol]-heights[current[0]][current[1]]));
                if (newEffort < effort[newRow][newCol]) {
                    effort[newRow][newCol] = newEffort;
                    queue.offer(new int[]{newRow, newCol, newEffort});
                }
            }
        }
        return effort[m-1][n-1];
    }
}
