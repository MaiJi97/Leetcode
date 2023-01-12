class Solution {
    int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int shortestDistance(int[][] maze, int[] start, int[] destination) {
        int[][] distance = new int[maze.length][maze[0].length]; // stores distance from start to current position
        for (int[] row : distance) Arrays.fill(row, Integer.MAX_VALUE);
        distance[start[0]][start[1]] = 0;
        dijkstra(maze, start, distance);
        return distance[destination[0]][destination[1]] == Integer.MAX_VALUE ? -1 : distance[destination[0]][destination[1]];
    }

    public void dijkstra(int[][] maze, int[] start, int[][] distance) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[2]-b[2]); 
        // in pq: <x, y, distance from start to xy>
        pq.offer(new int[]{start[0], start[1], 0});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            for (int[] direction : directions) {
                int newX = current[0] + direction[0];
                int newY = current[1] + direction[1];
                int count = 1;
                while (newX >= 0 && newY >= 0 && newX < maze.length && newY < maze[0].length && maze[newX][newY] == 0) {
                    newX += direction[0];
                    newY += direction[1];
                    count++;
                }
                newX -= direction[0];
                newY -= direction[1];
                count--;
                if (distance[current[0]][current[1]] + count < distance[newX][newY]) {
                    distance[newX][newY] = distance[current[0]][current[1]] + count;
                    pq.offer(new int[]{newX, newY, distance[newX][newY]});
                }
            }
            
        }
    }
}
