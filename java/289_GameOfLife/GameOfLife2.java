class Solution {
    int[] directions = {0, 1, -1};
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (directions[x] == 0 && directions[y] == 0) continue;
                        int newX = i + directions[x];
                        int newY = j + directions[y];
                        if (newX < 0 || newX >= m || newY < 0 || newY >= n || board[newX][newY] == 0 || board[newX][newY] == 2) continue;
                        liveNeighbors++;
                    }
                }
                if (board[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) board[i][j] = -1; // -1 means 1=>0
                else if (board[i][j] == 0 && liveNeighbors == 3) board[i][j] = 2; // 2 means 0=>1
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == -1) board[i][j] = 0;
                if (board[i][j] == 2) board[i][j] = 1;
            }
        }
    }
}
