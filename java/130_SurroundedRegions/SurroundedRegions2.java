class Solution {

    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && (i == 0 || i == m - 1 || j == 0 || j == n -1)) bfs(board, i, j, visited); 
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = visited[i][j] ? 'O' : 'X';
            }
        }
    }

    public void bfs(char[][] board, int i, int j, boolean[][] visited) {
        Queue<int[]> q = new ArrayDeque<>();
        List<int[]> list = new ArrayList<>();
        q.offer(new int[]{i, j});
        visited[i][j] = true;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            
            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];
                if (newX < 0 || newX >= board.length || newY < 0 || newY >= board[0].length || visited[newX][newY] == true || board[newX][newY] == 'X') continue;
                q.offer(new int[]{newX, newY});
                visited[newX][newY] = true;
            }
        }
    }
}
