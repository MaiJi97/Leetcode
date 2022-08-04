class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }
        int len = nums1.length + nums2.length;
        int leftA = 0;
        int rightA = nums1.length;
        int cutA; // nums1分割线左边元素个数
        int cutB; // nums2分割线左边元素个数
        while (leftA <= rightA) {
            cutA = (leftA + rightA) / 2;
            cutB = (len + 1) / 2 - cutA;
            double L1 = cutA == 0 ? Integer.MIN_VALUE : nums1[cutA - 1]; // nums1分割线左侧元素index
            double L2 = cutB == 0 ? Integer.MIN_VALUE : nums2[cutB - 1]; // nums2分割线左侧元素index
            double R1 = cutA == nums1.length ? Integer.MAX_VALUE : nums1[cutA]; // nums1分割线右侧元素index
            double R2 = cutB == nums2.length ? Integer.MAX_VALUE : nums2[cutB]; // nums2分割线右侧元素index
            
            if (L1 > R2) {
                rightA = cutA - 1;
            }
            
            else if (L2 > R1) {
                leftA = cutA + 1;
            }
            
            else {
                if (len % 2 == 0) {
                    return (Math.max(L1, L2) + Math.min(R1, R2)) / 2;
                }
                else {
                    return Math.max(L1, L2);
                }
            }
        }
        return -1;
    }
}
