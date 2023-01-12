class Solution {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int[][] distance = new int[maze.length][maze[0].length]; // stores distance from start to current position
        for (int[] row : distance) Arrays.fill(row, Integer.MAX_VALUE);
        distance[start[0]][start[1]] = 0;

        dfs(maze, start, destination, distance);
    
        return distance[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 : distance[destination[0]][destination[1]];
    }

    public void dfs (int[][] maze, int[] current, int[] destination, int[][] distance) {

        for (int[] direction : directions) {
            int newX = current[0] + direction[0];
            int newY = current[1] + direction[1];
            int count = 1;
            while (newX >= 0 && newY >= 0 && newX < maze.length && newY < maze[0].length && maze[newX][newY] == 0) {
                newX += direction[0];
                newY += direction[1];
                count++;
            }
            newX -= direction[0]; // 已不满足while条件，退一步
            newY -= direction[1]; // 已不满足while条件，退一步
            count--;
            if (distance[current[0]][current[1]] + count < distance[newX][newY]) {
                distance[newX][newY] = distance[current[0]][current[1]] + count;
                dfs(maze, new int[]{newX, newY}, destination, distance);
            }
        }
    }
}
