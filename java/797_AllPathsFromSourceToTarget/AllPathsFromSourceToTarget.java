class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        if (graph.length == 0) {
            return null;
        }
        List<List<Integer>> ret = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        helper(graph, 0, path, ret);
        return ret;
        
    }

    public void helper(int[][] graph, int start, List<Integer> path, List<List<Integer>> ret) {
        if (start == graph.length - 1) {
            ret.add(new ArrayList<Integer>(path)); // append a copy of the current path arraylist because the last element is going to be removed
            return;
        }
        for (int i = 0; i < graph[start].length; i++) {
            path.add(graph[start][i]);
            helper(graph, graph[start][i], path, ret);
            path.remove(path.size()-1);
        }
    }
}
