class Solution {
    public int countComponents(int n, int[][] edges) {
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for (int i = 0; i < edges.length; i++) {
            int[] edge = edges[i];
            if (!hm.containsKey(edge[0])) {
                hm.put(edge[0], new ArrayList<>());
            }
            if (!hm.containsKey(edge[1])) {
                hm.put(edge[1], new ArrayList<>());
            }
            hm.get(edge[0]).add(edge[1]);
            hm.get(edge[1]).add(edge[0]);
        }
        int ret = 0;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                dfs(hm, visited, i);
                ret++;
            }
        }
        return ret;
    }

    private void dfs(HashMap<Integer, List<Integer>> hm, boolean[] visited, int i) {
        if (hm.containsKey(i)) {
            for (int neighbor : hm.get(i)) {
                if (visited[neighbor]) {
                    continue;
                }
                visited[neighbor] = true;
                dfs(hm, visited, neighbor);
            }
        }
    }
}
