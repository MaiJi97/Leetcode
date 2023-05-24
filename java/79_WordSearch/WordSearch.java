class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) return true;
            }
        }
        return false;
    }

    public boolean dfs(char[][] board, String word, int i, int j, int current) {
        if (current == word.length()) return true;

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }

        else if (word.charAt(current) == board[i][j]) {
            char temp = board[i][j];
            board[i][j] = '#';
            boolean ret = dfs(board, word, i+1, j, current + 1) || helper(board, word, i-1, j, current + 1) || helper(board, word, i, j+1, current + 1) || helper(board, word, i, j-1, current + 1);
            board[i][j] = temp;
            return ret;
        }
        return false;
    }
}
