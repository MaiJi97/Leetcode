class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }
        List<Integer>[] bucketSort = new List[nums.length + 1];
        for (Integer element : hm.keySet()) {
            if (bucketSort[hm.get(element)] == null) {
                bucketSort[hm.get(element)] = new ArrayList<>();
            }
            bucketSort[hm.get(element)].add(element);
        }
        int[] ret = new int[k];
        
        for (int i = bucketSort.length - 1; i >= 0; i--) {
            if (bucketSort[i] != null) {
                for (int j = 0; j < bucketSort[i].size(); j++) {
                    ret[k - 1] = bucketSort[i].get(j);
                    k--;
                    if (k <= 0) return ret;
                }
            }
        }
        return ret;
    }
}
