class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        while (!q.isEmpty()) {
            int current = q.poll();
            if (arr[current] == 0) return true;
            visited[current] = true;
            int left = current - arr[current];
            int right = current + arr[current];
            if (left >= 0) {
                if (!visited[left]) q.add(left);
            }
            if (right <= arr.length - 1) {
                if (!visited[right]) q.add(right);
            }
        }
        return false;

    }
}
