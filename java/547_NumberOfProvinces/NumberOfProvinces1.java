class Solution {
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        boolean[] visited = new boolean[isConnected.length];
        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i] == false) {
                bfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }
    
    private void bfs(int i, int[][] isConnected, boolean[] visited) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(i);
        visited[i] = true;
        while (!q.isEmpty()) {
            Integer current = q.poll();
            for (int j = 0; j < isConnected[i].length; j++) {
                if (isConnected[current][j] == 1 && visited[j] == false) {
                    q.offer(j);
                    visited[j] = true;
                }
            }
        }
    }
}
