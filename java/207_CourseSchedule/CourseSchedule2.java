class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preMap = new HashMap<>();
        int[] inDegree = new int[numCourses];
        
        for (int i = 0; i < numCourses; ++i) { 
            preMap.put(i, new ArrayList<Integer>());
        }
        for (int[] pre : prerequisites) {
            preMap.get(pre[1]).add(pre[0]); // build graph, pre[1] and pre[0]和dfs为反向
            ++inDegree[pre[0]]; // 统计每个点的in degree
        }
        
        Queue<Integer> queue = new ArrayDeque<>();
        
        for (int i = 0; i < numCourses; i++) {
            if (inDegree[i] == 0) {
                queue.offer(i); // 将每个in degree为0的点放入queue中作为起始点
            }
        }
        
        while (!queue.isEmpty()) {
            int curr = queue.poll(); // 拿出一个点并去掉所有连边，in degree - 1
            for (Integer neighbor : preMap.get(curr)) {
                --inDegree[neighbor];
                if (inDegree[neighbor] == 0) { // 一旦发现新的in degree为0的点，丢入queue中
                    queue.offer(neighbor);
                }
            }
        }
        
        for (int i = 0; i < numCourses; ++i) {
            if (inDegree[i] != 0) {
                return false;
            }
        }
        return true;    
    }
}
