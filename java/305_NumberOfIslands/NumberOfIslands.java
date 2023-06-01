class Solution {
    public List<Integer> numIslands2(int m, int n, int[][] positions) {
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        DSU dsu = new DSU(m * n);
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        List<Integer> ret = new ArrayList<>();
        for (int[] position : positions) {
            if (visited[position[0]][position[1]]) {
                ret.add(count);
                continue;
            }
            visited[position[0]][position[1]] = true;
            count++;
            for (int[] direction : directions) {
                int newX = position[0] + direction[0];
                int newY = position[1] + direction[1];
                if (newX < 0 || newX >= m || newY < 0 || newY >= n || visited[newX][newY] == false) continue;
                int component1 = dsu.find(position[0] * n + position[1]);
                int component2 = dsu.find(newX * n + newY);
                if (component1 != component2) {
                    count--;
                    dsu.union(component1, component2);
                }
            } 
            ret.add(count);
        }
        return ret;
    }
}

class DSU {
    int[] parent;
    public DSU(int n) {
        parent = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
    }

    public int find(int x) { // Find terminal parent
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x]; 
    }

    public void union(int x, int y) {
        parent[find(x)] = find(y);
    }
}
