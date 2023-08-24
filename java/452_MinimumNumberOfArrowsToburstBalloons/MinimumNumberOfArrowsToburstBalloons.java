class Solution {
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) return 0;
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        int arrow = points[0][1];
        int ret = 1;
        for (int i = 1; i < points.length; i++) {
            int[] interval = points[i];
            if (arrow < interval[0]) {
                ret++;
                arrow = interval[1];
            }
        }
        return ret;
    }
}

