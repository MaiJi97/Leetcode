class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[] prev = new int[n];
        int[] current = new int[n];

        for (int j = 0; j < n; j++) {
            prev[j] = triangle.get(n-1).get(j);
        }
        for (int i = n - 2; i >= 0; i--){
            for (int j = 0; j < triangle.get(i).size(); j++) {
                int left = prev[j] + triangle.get(i).get(j);
                int right = prev[j + 1] + triangle.get(i).get(j);
                current[j] = Math.min(left, right);
            }
            prev = current.clone();
        }
        return prev[0];
    }
}
