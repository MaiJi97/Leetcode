class Solution {
    int[] deltaX = {-2, -1, 1, 2, -2, -1, 1, 2};
    int[] deltaY = {1, 2, 2, 1, -1, -2, -2, -1};
    public int minKnightMoves(int x, int y) {
        Queue<int[]> q = new ArrayDeque<>();
        // HashSet<String> visited = new HashSet<>();
        boolean[][] visited = new boolean[607][607];
        q.offer(new int[]{0, 0});
        visited[0][0] = true;
        int ret = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                if (current[0] == x && current[1] == y) return ret;
                for (int direction = 0; direction < 8; direction++) {
                    int newX = current[0] + deltaX[direction];
                    int newY = current[1] + deltaY[direction];
                    if (visited[newX + 302][newY + 302]) continue;
                    q.offer(new int[]{newX, newY});
                    visited[newX + 302][newY + 302] = true;
                }
            }
            ret++;
        }
        return -1;
    }
}
