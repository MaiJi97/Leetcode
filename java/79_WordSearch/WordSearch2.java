public class Solution {

    // What if we also want to print the path
    
    private List<int[]> getWordPath(char[][] grid, String word) {

        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                List<int[]> path = new ArrayList<>();
                if (dfs(grid, word, i, j, 0, path)) {
                    return path;
                };
            }
        }
        return new ArrayList<>();
    }

    public boolean dfs(char[][] grid, String word, int i, int j, int current, List<int[]> path) {
        if (current == word.length()) return true;

        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || word.charAt(current) != grid[i][j]) {
            return false;
        }

        path.add(new int[]{i, j});

        boolean findWord = dfs(grid, word, i+1, j, current + 1, path) || dfs(grid, word, i, j+1, current + 1, path);

        if (!findWord) {
            path.remove(path.size() - 1);
        }

        return findWord;
    }
}
