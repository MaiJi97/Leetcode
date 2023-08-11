class Solution {
    int[] directions = {0, 1, -1};
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int[][] copy = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                copy[i][j] = board[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = 0;
                for (int x = 0; x < 3; x++) {
                    for (int y = 0; y < 3; y++) {
                        if (directions[x] == 0 && directions[y] == 0) continue;
                        int newX = i + directions[x];
                        int newY = j + directions[y];
                        if (newX < 0 || newX >= m || newY < 0 || newY >= n || copy[newX][newY] == 0) continue;
                        liveNeighbors++;
                    }
                }
                if (copy[i][j] == 1 && (liveNeighbors < 2 || liveNeighbors > 3)) board[i][j] = 0;
                else if (copy[i][j] == 0 && liveNeighbors == 3) board[i][j] = 1;
            }
        }
    }
}
