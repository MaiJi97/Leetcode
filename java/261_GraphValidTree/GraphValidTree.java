class Solution {
    public boolean validTree(int n, int[][] edges) {
        if (edges.length != (n-1)) return false;

        HashMap<Integer, List<Integer>> hm = new HashMap<>();

        for (int i = 0; i < n; i++) {
            hm.put(i, new ArrayList<>());
        }

        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            hm.get(edge[0]).add(edge[1]);
            hm.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        dfs(hm, visited, 0);
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) return false;
        }
        return true;
    }

    private void dfs(HashMap<Integer, List<Integer>> hm, boolean[] visited, int i) {
        visited[i] = true;
        for (int neighbor : hm.get(i)) {
            if (visited[neighbor]) {
                continue;
            }
            dfs(hm, visited, neighbor);
        }
    }
}
