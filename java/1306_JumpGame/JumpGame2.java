class Solution {
    public boolean canReach(int[] arr, int start) {
        boolean[] visited = new boolean[arr.length];
        return dfs(arr, start, visited);
    }

    private boolean dfs (int[] arr, int current, boolean[] visited) {
        if (arr[current] == 0) return true;
        visited[current] = true;
        int left = current - arr[current];
        int right = current + arr[current];
        if (left >= 0 && !visited[left]) {
            if (dfs(arr, left, visited)) return true;
        }
        if (right <= arr.length - 1 && !visited[right]) {
            if (dfs(arr, right, visited)) return true;
        }
        return false;
    }
}
