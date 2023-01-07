class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> {
            return a[0] - b[0];
        });
        List<int[]> ret = new ArrayList<>();
        int[] newInterval = intervals[0];
        ret.add(newInterval);
        for (int i = 0; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] > newInterval[1]) {
                ret.add(interval);
                newInterval = interval;
            }
            else {
                newInterval[1] = Math.max(interval[1], newInterval[1]);
            }
        }
        return ret.toArray(new int[ret.size()][]);    
    }
}
