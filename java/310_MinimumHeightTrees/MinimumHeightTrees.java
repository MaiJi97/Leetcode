class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> ret = new ArrayList<>();

        if (n == 0) return ret;
        if (n == 1) {
            ret.add(0);
            return ret;
        }
        if (n == 2) {
            ret.add(0);
            ret.add(1);
            return ret;
        }
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) graph.put(i, new ArrayList<>());
        int[] inDegree = new int[n];
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
            inDegree[u]++;
            inDegree[v]++;
        }
        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < inDegree.length; i++) {
            if (inDegree[i] == 1) q.offer(i);
        }

        while (!q.isEmpty()) {
            int size = q.size();
            ret.clear();
            for (int i = 0; i < size; i++) {
                int leaf = q.poll();
                ret.add(leaf);
                for (int neighbor : graph.get(leaf)) {
                    inDegree[neighbor]--;
                    if (inDegree[neighbor] == 1) {
                        q.offer(neighbor);
                    }
                }
            }
        }
        return ret;
    }
}
