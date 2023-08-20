class Solution {
    int[] deltaX = {-2, -1, 1, 2, -2, -1, 1, 2};
    int[] deltaY = {1, 2, 2, 1, -1, -2, -2, -1};
    public int minKnightMoves(int x, int y) {
        x = Math.abs(x);
        y = Math.abs(y);
        Queue<int[]> q = new ArrayDeque<>();
        HashSet<String> visited = new HashSet<>();
        q.offer(new int[]{0, 0});
        visited.add("0, 0");
        int ret = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                int[] current = q.poll();
                if (current[0] == x && current[1] == y) return ret;
                for (int direction = 0; direction < 8; direction++) {
                    int newX = current[0] + deltaX[direction];
                    int newY = current[1] + deltaY[direction];
                    if (!visited.contains(newX + ", " + newY) && newX >= -2 && newY >= -2) {
                        q.offer(new int[]{newX, newY});
                        visited.add(newX + ", " + newY);
                    }
                }
            }
            ret++;
        }
        return -1;
    }
}
