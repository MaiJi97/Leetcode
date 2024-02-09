class Solution {
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucketSort = new List[nums.length + 1];

        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (bucketSort[freq] == null) {
                bucketSort[freq] = new ArrayList<>();
            }
            bucketSort[freq].add(key);
        }

        int degree = nums.length;
        while (degree >= 0 && bucketSort[degree] == null) {
            degree--;
        }

        List<Integer> degreeElements = bucketSort[degree];

        int ret = nums.length;

        for (int degreeElement : degreeElements) {
            ret = Math.min(ret, getMaxLength(nums, degreeElement));
        }
        return ret;
    }

    private int getMaxLength(int[] nums, int degreeElement) { // get first and last occurrence of an element
        int start = -1;
        int end = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == degreeElement) {
                if (start == -1) start = i;
                end = i;
            }
        }
        return end - start + 1;
    }
    
}
