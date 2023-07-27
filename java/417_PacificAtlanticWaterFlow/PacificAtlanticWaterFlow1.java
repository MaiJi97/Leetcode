class Solution {
    
    int[] deltaX = {0, 1, -1, 0};
    int[] deltaY = {1, 0, 0, -1};

    private int m;
    private int n;
    private int[][] landHeights;

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        this.m = heights.length;
        this.n = heights[0].length;
        this.landHeights = heights;

        Queue<int[]> pacificQueue = new ArrayDeque<>();
        Queue<int[]> atlanticQueue = new ArrayDeque<>();
        
        for (int i = 0; i < m; i++) {
            pacificQueue.offer(new int[]{i, 0});
            atlanticQueue.offer(new int[]{i , n - 1});
        }
        for (int j = 0; j < n; j++) {
            pacificQueue.offer(new int[]{0, j});
            atlanticQueue.offer(new int[]{m - 1 , j});
        }
        boolean[][] pacificReacheable = bfs(pacificQueue);
        boolean[][] atlanticReacheable = bfs(atlanticQueue);
        
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (pacificReacheable[i][j] && atlanticReacheable[i][j]) {
                    ret.add(List.of(i, j));
                }
            }
        }
        return ret;
    }

    private boolean[][] bfs(Queue<int[]> q) {
        boolean[][] reacheable = new boolean[m][n];
        while (!q.isEmpty()) {
            int[] current = q.poll();
            reacheable[current[0]][current[1]] = true;
            for (int direction = 0; direction < 4; direction++) {
                int newX = current[0] + deltaX[direction];
                int newY = current[1] + deltaY[direction];
                if (newX < 0 || newX >= m || newY < 0 || newY >= n || reacheable[newX][newY] || landHeights[newX][newY] < landHeights[current[0]][current[1]]) {
                    continue;
                }
                q.offer(new int[]{newX, newY});
            }
        }
        return reacheable;
    }

}
