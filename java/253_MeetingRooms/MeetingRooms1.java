class Solution {
    public int minMeetingRooms(int[][] intervals) {
        List<int[]> list = new ArrayList<>();
        for (int[] interval : intervals) {
            list.add(new int[]{interval[0], 1}); // start
            list.add(new int[]{interval[1], -1}); // end
        }
        int count = 0; 
        int ret = 0;
        Collections.sort(list, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        for (int[] interval : list) {
            if (interval[1] == 1) {
                count++;
            }
            else {
                count--;
            }
            ret = Math.max(ret, count);
        }
        return ret;
    }
}
