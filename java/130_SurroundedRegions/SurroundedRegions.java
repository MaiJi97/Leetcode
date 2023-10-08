class Solution {

    static int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j] == false && board[i][j] == 'O') bfs(board, i, j, visited);
            }
        }
    }

    public void bfs(char[][] board, int i, int j, boolean[][] visited) {
        Queue<int[]> q = new ArrayDeque<>();
        List<int[]> list = new ArrayList<>();
        q.offer(new int[]{i, j});
        visited[i][j] = true;
        boolean flip = true;
        while (!q.isEmpty()) {
            int[] current = q.poll();
            int x = current[0];
            int y = current[1];
            if (x == 0 || x == board.length - 1 || y == 0 || y == board[0].length - 1) flip = false;
            list.add(current);
            
            for (int[] direction : directions) {
                int newX = x + direction[0];
                int newY = y + direction[1];
                if (newX < 0 || newX >= board.length || newY < 0 || newY >= board[0].length || visited[newX][newY] == true || board[newX][newY] == 'X') continue;
                q.offer(new int[]{newX, newY});
                visited[newX][newY] = true;
            }
        }

        for (int[] pair : list) {
            if (flip == true) board[pair[0]][pair[1]] = 'X';
        }
    }
}
