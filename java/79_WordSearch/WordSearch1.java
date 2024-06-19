class Solution {
    int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    public boolean exist(char[][] board, String word) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 0, visited)) return true;
                }
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int index, boolean[][] visited) {
        if (index == word.length()) return true;
        else if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] == true || word.charAt(index) != board[i][j]) {
            return false;
        }
        visited[i][j] = true;
        for (int[] direction : directions) {
            int newX = i + direction[0];
            int newY = j + direction[1];
            if (dfs(board, word, newX, newY, index + 1, visited)) return true;
        }
        visited[i][j] = false;
        return false;
    }
    
}
