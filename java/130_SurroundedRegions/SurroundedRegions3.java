class Solution {

    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == m - 1 || j == 0 || j == n -1) dfs(board, i, j, visited);
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = visited[i][j] ?'O' : 'X';
            }
        }
    }

    public void dfs(char[][] board, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || board[i][j] == 'X' || visited[i][j]) {
            return;
        }

        visited[i][j] = true;

        for (int[] direction : directions) {
            int newX = i + direction[0];
            int newY = j + direction[1];
            dfs(board, newX, newY, visited);
        }
    }
}
