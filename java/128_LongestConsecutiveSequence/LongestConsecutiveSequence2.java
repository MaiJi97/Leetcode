class Solution {
    public int longestConsecutive(int[] nums) {

        DSU dsu = new DSU(nums.length);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) continue;
            map.put(nums[i], i); // why use index instead of num? might have duplicates
            if (map.containsKey(nums[i] - 1)) dsu.union(i, map.get(nums[i] - 1)); 
            if (map.containsKey(nums[i] + 1)) dsu.union(i, map.get(nums[i] + 1));
        }
        int ret = dsu.findMax(); 
        return ret;
    }

}

class DSU { // union find: parent储存nums中每一个num所属的boundary index，最终我们需要的findMax是parent中出现最多次的element的个数
    int[] parent;
    int[] size; 

    public DSU(int n) {
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) parent[i] = i;
        Arrays.fill(size, 1);
    }

    public int find(int x) { // Find terminal parent
        if (parent[x] != x) parent[x] = find(parent[x]);
        return parent[x]; 
    }

    public void union(int x, int y) {
        int rootX = find(x);
        int rootY = find(y);
        if (rootX == rootY) return;
        if (size[rootX] <= size[rootY]) {
            parent[rootX] = rootY;
            size[rootY] += size[rootX];
        }
        else {
            parent[rootY] = rootX;
            size[rootX] += size[rootY];
        }
        // parent[find(x)] = find(y);
    }

    public int findMax() {
        int max = 0;
        for (int s : size) max = Math.max(max, s);
        return max;
    }
    // public int findMax() {
    //     HashMap<Integer, Integer> temp = new HashMap<>();
    //     int max = 0;
    //     for (int element : parent) {
    //         temp.put(element, temp.getOrDefault(element, 0) + 1);
    //         max = Math.max(temp.get(element), max);
    //     }
    //     return max;
    // }
}
