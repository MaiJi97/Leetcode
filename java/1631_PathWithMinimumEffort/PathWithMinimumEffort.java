class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length;
        int n = heights[0].length;
        if (m == 1 && n == 1) {
            return 0;
        }
        int[][] opt = new int[m][n];
        for (int[] nums : opt) {
            Arrays.fill(nums, Integer.MAX_VALUE);
        }
        int[][] direction = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};
        // Queue<int[]> queue = new ArrayDeque<>();
        PriorityQueue<int[]> queue = new PriorityQueue<int[]>((n1, n2) -> (n1[2]-n2[2]));
        queue.offer(new int[]{0, 0, 0});
        while (!queue.isEmpty()) {
            int[] block = queue.poll();
            int row = block[0];
            int col = block[1];
            int weight = block[2];
            for (int i = 0; i < 4; i++) {
                int newRow = row + direction[i][0];
                int newCol = col + direction[i][1];
                if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n) {
                    continue;
                }
                int newWeight = Math.max(weight, Math.abs(heights[newRow][newCol]-heights[row][col]));
                if (newWeight < opt[newRow][newCol]) {
                    opt[newRow][newCol] = newWeight;
                    queue.offer(new int[]{newRow, newCol, newWeight});
                }
            }
        }
        return opt[m-1][n-1];
    }
}
