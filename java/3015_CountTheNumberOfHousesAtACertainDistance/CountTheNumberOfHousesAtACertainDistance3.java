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

        int[][] minDistance = new int[n][n];
        for (int[] row : minDistance) {
            Arrays.fill(row, Integer.MAX_VALUE);
        }

        for (int i = 1; i <= n; i++) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            pq.offer(new int[] {i, 0});
            minDistance[i - 1][i - 1] = 0;
            while (!pq.isEmpty()) {
                int[] current = pq.poll();
                List<Integer> neighbors = graph.get(current[0]);
                for (int neighbor : neighbors) {
                    if (current[1] + 1 < minDistance[i - 1][neighbor - 1]) {
                        minDistance[i - 1][neighbor - 1] = current[1] + 1;
                        pq.offer(new int[] {neighbor, current[1] + 1});
                    }
                }
            }

            for (int distance : minDistance[i - 1]) {
                if (distance >= 1) ret[distance - 1]++;
            }
        }
        return ret;

    }
}
