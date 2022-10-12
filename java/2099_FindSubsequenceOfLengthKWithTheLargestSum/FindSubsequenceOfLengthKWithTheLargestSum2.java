class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0]-b[0]);
        for (int i = 0; i < nums.length; i++) {
            pq.add(new int[]{nums[i], i});
        }
        while (pq.size() > k) {
            pq.poll();
        }
        ArrayList<int[]> list = new ArrayList<>(pq);
        Collections.sort(list, (a, b) -> a[1] - b[1]);
        int[] ret = new int[k];
        for (int i = 0; i < k; i++) {
            ret[i] = list.get(i)[0];
        }
        return ret;
    }
}
