class Solution {

    int[][] directions = {{-1, 0}, {1, 0}, {0, 1}, {0, -1}};
    public int maximumSafenessFactor(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] distanceToThief = distanceToThief(grid); // min distance each cell is to a thief
        int[][] dist = new int[n][n];
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[2] - a[2]);
        pq.offer(new int[]{0, 0, distanceToThief[0][0]});
        while (!pq.isEmpty()) {
            int[] current = pq.poll();
            int x = current[0];
            int y = current[1];
            int safety = current[2]; // safety factor of current path so far
            if (x == n - 1 && y == n - 1) return safety;
            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];
                if (newX >= 0 && newX < n && newY >= 0 && newY < n) {
                    int newSafety = Math.min(safety, distanceToThief[newX][newY]);
                    if (newSafety > dist[newX][newY]) {
                        dist[newX][newY] = newSafety;
                        pq.offer(new int[]{newX, newY, newSafety});
                    }
                }
            }
        }
        return -1;
    }

    private int[][] distanceToThief(List<List<Integer>> grid) {
        int n = grid.size();
        int[][] dist = new int[n][n];
        Queue<int[]> queue = new LinkedList<>();
        
        for (int[] row : dist) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n;  j++) {
                if (grid.get(i).get(j) == 1) {
                    queue.offer(new int[]{i, j});
                    dist[i][j] = 0;
                }
            }
        }
        
        int distance = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            distance++;
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0];
                int y = current[1];
                
                for (int[] direction : directions) {
                    int newX = x + direction[0];
                    int newY = y + direction[1];    
                    if (newX >= 0 && newX < n && newY >= 0 && newY < n && distance < dist[newX][newY]) {
                        dist[newX][newY] = distance;
                        queue.offer(new int[]{newX, newY});
                    }
                }
            }
        }
        
        return dist;
    }
}
