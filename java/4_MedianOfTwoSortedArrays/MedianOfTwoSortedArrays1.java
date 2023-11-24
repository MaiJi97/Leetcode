class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] sorted = new int[m + n];
        int pointer1 = 0;
        int pointer2 = 0;
        int index = 0;
        while (pointer1 < m && pointer2 < n) {
            if (nums1[pointer1] < nums2[pointer2]) {
                sorted[index] = nums1[pointer1];
                pointer1++;
            }
            else {
                sorted[index] = nums2[pointer2];
                pointer2++;
            }
            index++;
        }

        if (pointer1 < m) {
            sorted[index] = nums1[pointer1];
            pointer1++;
        }

        if (pointer2 < n) {
            sorted[index] = nums2[pointer2];
            pointer2++;
        }
        return (m + n) % 2 == 1 ? (double)sorted[(m + n) / 2] : (double)(sorted[(m + n) / 2 - 1] + sorted[(m + n) / 2]) / 2;
        
    }
}
