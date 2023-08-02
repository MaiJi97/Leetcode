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
                bfs(hm, visited, i);
                ret++;
            }
        }
        return ret;
    }

    private void bfs(HashMap<Integer, List<Integer>> hm, boolean[] visited, int i) {
        Queue<Integer> q = new ArrayDeque<>();
        q.offer(i);
        visited[i] = true;
        while (!q.isEmpty()) {
            int current = q.poll();
            if (hm.containsKey(current)) {
                for (int neighbor : hm.get(current)) {
                    if (visited[neighbor]) {
                        continue;
                    }
                    q.offer(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }
}
