class Solution {
    
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        return dfs(maze, start, destination, visited);
    }

    public boolean dfs (int[][] maze, int[] current, int[] destination, boolean[][] visited) {
        if (current[0] == destination[0] && current[1] == destination[1]) {
            return true;
        }
        else if (visited[current[0]][current[1]]) {
            return false;
        }
        visited[current[0]][current[1]] = true;

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
                if (dfs(maze, new int[]{newX, newY}, destination, visited)) return true;
            }
        }
        return false;
    }
}
