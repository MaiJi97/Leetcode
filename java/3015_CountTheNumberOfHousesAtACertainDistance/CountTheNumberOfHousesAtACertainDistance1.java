class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        HashMap<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }
        for (int i = 1; i < n; i++) {
            int from = i;
            int to = i + 1;
            graph.get(from).add(to);
            graph.get(to).add(from);
        }
        graph.get(x).add(y);
        graph.get(y).add(x);
        
        int[] ret = new int[n];

        for (int i = 1; i <= n; i++) {
            int[] visited = new int[n + 1];
            Queue<Integer> q = new ArrayDeque<>();
            visited[i] = 1;
            q.offer(i);
            int distance = 0;
            while (!q.isEmpty()) {
                int size = q.size();
                for (int j = 0; j < size; j++) {
                    int current = q.poll();
                    if (current != i) ret[distance - 1]++;
                    List<Integer> neighbors = graph.get(current);
                    for (int neighbor : neighbors) {
                        if (visited[neighbor] == 0) {
                            visited[neighbor] = 1;
                            q.offer(neighbor);
                        }
                    }
                }
                distance++;
            }
        }
        return ret;
    }
}
