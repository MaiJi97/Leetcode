class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        int[] inDegree = new int[numCourses];

        for (int i = 0; i < numCourses; i++) { 
            graph.put(i, new ArrayList<Integer>());
        }
        
        for (int[] pre : prerequisites) { // construct graph, count inDegree of each node
            int from = pre[1];
            int to = pre[0];
            graph.get(from).add(to);
            inDegree[to]++;
        }
        
        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i); // 将每个in degree为0的点放入queue中作为起始点
            }
        }

        int count = 0;
        
        while (!queue.isEmpty()) {
            int current = queue.poll(); // 拿出一个点并去掉所有连边，in degree - 1
            count++;
            for (Integer neighbor : graph.get(current)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) { // 一旦发现新的in degree为0的点，丢入queue中
                    queue.offer(neighbor);
                }
            }
        }

        return count == numCourses;    
    }
}
