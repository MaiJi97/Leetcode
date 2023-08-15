class Solution {
    public int findLength(int[] nums1, int[] nums2) {
        int ret = 0;
        HashMap<Integer, List<Integer>> hm = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            if (!hm.containsKey(nums2[i])) {
                hm.put(nums2[i], new ArrayList<>());
            }
            hm.get(nums2[i]).add(i);
        }
        for (int i = 0; i < nums1.length; i++) {
            if (hm.containsKey(nums1[i])) {
                for (int index : hm.get(nums1[i])) {
                    int pointer1 = i;
                    int pointer2 = index;
                    int count = 0;
                    while (pointer1 < nums1.length && pointer2 < nums2.length) {
                        if (nums1[pointer1] == nums2[pointer2]) {
                            count++;
                            ret = Math.max(ret, count);
                            pointer1++;
                            pointer2++;
                        }
                        else break;
                    }
                }
            }
        }
        return ret;
    }
}
