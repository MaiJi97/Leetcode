class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> preMap = new HashMap<>();
        
        for (int i=0; i < numCourses; i++) {
            preMap.put(i, new ArrayList<Integer>());
        }
        for (int[] pre : prerequisites) {
            preMap.get(pre[0]).add(pre[1]);
        }
        int[] visited = new int[numCourses];
        
        for (int i = 0; i < numCourses; i++) {
            if (visited[i] == 0) { // 0: the course is unvisited
                if (isCyclic(i, preMap, visited)) {
                    return false;
                }
            }
        }
        return true;    
    }
    
    private boolean isCyclic(int curr, Map<Integer, List<Integer>> preMap, int[] visited) {
        if (preMap.get(curr).size() == 0) {
            return false;
        }
        if (visited[curr] == 1) { // 1: the course is visited
            return true;
        }
        visited[curr] = 1; // mark the course as visited
        List<Integer> list = preMap.get(curr);
        for (int i = 0; i < list.size(); i++) {
            if (visited[list.get(i)] != 2) { // if the course not done
                if (isCyclic(list.get(i), preMap, visited)) {
                    return true;
                }
            }
        }
        visited[curr] = 2; // 2: the course is done
        return false;
    }
}
