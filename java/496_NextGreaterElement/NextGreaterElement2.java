class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ret = new int[nums1.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums2.length; i++) {
            hm.put(nums2[i], i);
        }
        for (int i = 0; i < nums1.length; i++) {
            int j = hm.get(nums1[i]) + 1;
            while (j < nums2.length) {
                if (nums2[j] > nums1[i]) {
                    ret[i] = nums2[j];
                    break;
                }
                else j++;
            }
            if (j == nums2.length) ret[i] = -1;
        }
        return ret;    
    }
}
