class Solution {
    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int shortestPath(int[][] grid, int k) {
        Queue<int[]> q = new ArrayDeque<>();
        boolean[][][] visited = new boolean[grid.length][grid[0].length][k + 1];
        q.offer(new int[]{0, 0, k});
        visited[0][0][k] = true;
        int count = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                int currentK = current[2];
                if (current[0] == grid.length - 1 && current[1] == grid[0].length - 1) {
                    return count;
                }
                for (int[] direction : directions) {
                    int newX = current[0] + direction[0];
                    int newY = current[1] + direction[1];
                    if (newX < 0 || newX >= grid.length || newY < 0 || newY >= grid[0].length) continue;
                    if (grid[newX][newY] == 0 && !visited[newX][newY][currentK]) {
                        q.offer(new int[]{newX, newY, currentK});
                        visited[newX][newY][currentK] = true;
                    }
                    else if (grid[newX][newY] == 1 && currentK > 0 && !visited[newX][newY][currentK - 1]) {
                        q.offer(new int[]{newX, newY, currentK - 1});
                        visited[newX][newY][currentK - 1] = true;
                    }
                }
            }
            count++;
        }
        return -1;
    }
}
