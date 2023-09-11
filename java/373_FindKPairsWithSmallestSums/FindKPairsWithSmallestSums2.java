class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        int m = nums1.length;
        int n = nums2.length;

        List<List<Integer>> ret = new ArrayList<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]); // int[sum, index1 from nums1, index2 from nums2]
        Set<Pair<Integer, Integer>> visited = new HashSet<>();
        pq.add(new int[]{nums1[0] + nums2[0], 0, 0}); 
        visited.add(new Pair<Integer, Integer>(0, 0));
        
        while (k > 0 && !pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int[] pair = pq.poll();
            int index1 = pair[1];
            int index2 = pair[2];
            temp.add(nums1[index1]);
            temp.add(nums2[index2]);
            ret.add(temp);
            k--;

            if (index1 + 1 < m) {
                Pair pair1 = new Pair<Integer, Integer>(index1 + 1, index2);
                if (!visited.contains(pair1)) {
                    pq.add(new int[]{nums1[index1+1]+nums2[index2], index1+1, index2});
                    visited.add(pair1);
                }
            }
            if (index2 + 1 < n) {
                Pair pair2 = new Pair<Integer, Integer>(index1, index2 + 1);
                if (!visited.contains(pair2)) {
                    pq.add(new int[]{nums1[index1]+nums2[index2+1], index1, index2+1});
                    visited.add(pair2);
                }
            }
        }
        return ret;
        
    }
}
