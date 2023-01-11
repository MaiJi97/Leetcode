class Solution {

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

        int right = current[1] + 1;
        while (right < maze[0].length && maze[current[0]][right] == 0) right++;
        if (dfs(maze, new int[]{current[0], right-1}, destination, visited)) return true;

        int left = current[1] - 1;
        while (left >= 0 && maze[current[0]][left] == 0) left--;
        if (dfs(maze, new int[]{current[0], left+1}, destination, visited)) return true;

        int up = current[0] - 1;
        while (up >= 0 && maze[up][current[1]] == 0) up--;
        if (dfs(maze, new int[]{up+1, current[1]}, destination, visited)) return true;

        int down = current[0] + 1;
        while (down < maze.length && maze[down][current[1]] == 0) down++;
        if (dfs(maze, new int[]{down-1, current[1]}, destination, visited)) return true;

        return false;
    }
}
