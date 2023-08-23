class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board.length; j++){
                board[i][j] = '.';
            }
        }

        List<List<String>> ret = new ArrayList<>();
        dfs(n, board, 0, ret);
        return ret;
    }

    private void dfs(int n, char[][] board, int row, List<List<String>> list) {
        if (row == n) {
            list.add(printQueen(board));
            return;
        }
        for (int col = 0; col < board[0].length; col++) {
            if (isSafePlace(board, row, col)) {
                board[row][col] = 'Q';
                dfs(n, board, row + 1, list);
                board[row][col] = '.';
            }
        }
    }

    private List<String> printQueen(char[][] board) {
        List<String> str = new ArrayList<>();

        for(int i = 0; i < board.length; i++){
            String row = new String(board[i]);
            str.add(row);
        }
        return str;
    }

    private boolean isSafePlace(char[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q') return false;
        }

        for (int j = 0; j < col; j++) {
            if (board[row][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') return false;
        }
        
        return true;
    }
}
