class Solution {
    
    int[] deltaX = {0, 1, -1, 0};
    int[] deltaY = {1, 0, 0, -1};


    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        boolean[][] pacificReacheable = new boolean[heights.length][heights[0].length];
        boolean[][] atlanticReacheable = new boolean[heights.length][heights[0].length];
        for (int i = 0; i < heights.length; i++) {
            pacificReacheable[i][0] = true;
            atlanticReacheable[i][heights[0].length - 1] = true;
            dfs(heights, i, 0, pacificReacheable);
            dfs(heights, i, heights[0].length - 1, atlanticReacheable);
        }

        for (int j = 0; j < heights[0].length; j++) {
            pacificReacheable[0][j] = true;
            atlanticReacheable[heights.length - 1][j] = true;
            dfs(heights, 0, j, pacificReacheable);
            dfs(heights, heights.length - 1, j, atlanticReacheable);
        }

        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < heights.length; i++) {
            for (int j = 0; j < heights[0].length; j++) {
                if (pacificReacheable[i][j] && atlanticReacheable[i][j]) {
                    ret.add(List.of(i, j));
                }
            }
        }
        return ret;
        
    }

    private void dfs(int[][] heights, int i, int j, boolean[][] reacheable) {

        for (int direction = 0; direction < 4; direction++) {
            int newX = i + deltaX[direction];
            int newY = j + deltaY[direction];
            if (newX >= 0 && newX < heights.length && newY >= 0 && newY < heights[0].length && !reacheable[newX][newY] && heights[newX][newY] >= heights[i][j]) {
                reacheable[newX][newY] = true;
                dfs(heights, newX, newY, reacheable);
            }
        }
    }

}
