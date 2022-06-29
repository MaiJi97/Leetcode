class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                dfs(i, isConnected, visited);
                count++;
            }
        }
        return count;
    }
    
    private void dfs(int i, int[][] isConnected, boolean[] visited) {
        visited[i] = true;
        for (int j = 0; j < isConnected[0].length; j++) {
            if (isConnected[i][j] == 1 && visited[j] == false) {
                dfs(j, isConnected, visited);
            }
        }
    }
}
