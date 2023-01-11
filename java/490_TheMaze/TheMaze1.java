class Solution {
    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        visited[start[0]][start[1]] = true;
        Queue<int[]> q = new ArrayDeque<>();
        q.offer(start);
        while(!q.isEmpty()) {
            int[] current = q.poll();
            if (current[0] == destination[0] && current[1] == destination[1]) return true;
            for (int[] direction : directions) {
                int newX = current[0] + direction[0];
                int newY = current[1] + direction[1];
                while (newX >= 0 && newY >= 0 && newX < maze.length && newY < maze[0].length && maze[newX][newY] == 0) {
                    newX += direction[0];
                    newY += direction[1];
                }
                newX -= direction[0]; // 已不满足while条件，退一步
                newY -= direction[1]; // 已不满足while条件，退一步
                if (!visited[newX][newY]) {
                    q.offer(new int[]{newX, newY});
                    visited[newX][newY] = true;
                }
            }
        }
        return false;
    }
}
