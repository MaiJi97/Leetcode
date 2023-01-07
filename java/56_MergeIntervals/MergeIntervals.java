class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        if (intervals.length == 0) {
            return intervals;
        }
        int[] newInterval = intervals[0];
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            if (newInterval[1] < interval[0]) { // no intersection, update newInterval
                list.add(newInterval);
                newInterval = interval;
            }
            else { // intersection, merge
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            }
        }
        list.add(newInterval); // add the last element to the list
        return list.toArray(new int[list.size()][]);
    }
}
