class Solution {
    public boolean exist(char[][] board, String word) {

        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, visited, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, boolean[][] visited, String word, int i, int j, int current) {
        if (current == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || word.charAt(current) != board[i][j]) {
            return false;
        }

        visited[i][j] = true;

        boolean ret = dfs(board, visited, word, i+1, j, current + 1) || dfs(board, visited, word, i-1, j, current + 1) || dfs(board, visited, word, i, j+1, current + 1) || dfs(board, visited, word, i, j-1, current + 1);
        
        visited[i][j] = false;
        return ret;
    }
}
