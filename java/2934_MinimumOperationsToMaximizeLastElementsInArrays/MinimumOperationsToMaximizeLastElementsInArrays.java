class Solution {
    public int minOperations(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int noSwap = solve(nums1, nums2, nums1[n - 1], nums2[n - 1]);
        int swap = solve(nums1, nums2, nums2[n - 1], nums1[n - 1]);
        if (swap != Integer.MAX_VALUE) swap++;
        int ret = Math.min(noSwap, swap);
        return ret == Integer.MAX_VALUE ? -1 : ret;
    }

    public int solve(int[] nums1, int[] nums2, int max1, int max2) {
        int swaps = 0;
        for (int i = 0; i < nums1.length - 1; i++) {
            if ((nums1[i] > max1 && nums1[i] > max2) || (nums2[i] > max1 && nums2[i] > max2) || (nums1[i] > max1 && nums2[i] > max1) || (nums1[i] > max2 && nums2[i] > max2)) {
                return Integer.MAX_VALUE;
            }
            else if (nums1[i] > max1 || nums2[i] > max2) swaps++;
        }
        return swaps;
    }
}
