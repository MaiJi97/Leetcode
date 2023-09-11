class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ret = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[0] + a[1])-(b[0] + b[1]));
        for (int num1 : nums1) {
            for (int num2 : nums2) {
                pq.offer(new int[]{num1, num2});
            }
        }
        while (k > 0 && !pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int[] pair = pq.poll();
            temp.add(pair[0]);
            temp.add(pair[1]);
            ret.add(temp);
            k--;
        }
        return ret;
        
    }
}
