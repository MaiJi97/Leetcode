class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int medianIndex = (m + n) / 2; // if is odd, get this index; if even, get average of this index and this previous index
        boolean isOdd = (m + n) % 2 == 0 ? false : true;
        int pointer1 = 0;
        int pointer2 = 0;
        int previous = 0;
        int current = 0;
        while (pointer1 + pointer2 <= medianIndex) { // assume pointer1=2, pointer2=3, we've traversed 5 elements and is going to determine the 6th one, medianIndex is 5 which is also the 6th element.
            previous = current;
            if (pointer1 < m && (pointer2 == n || nums1[pointer1] <= nums2[pointer2])) {
                current = nums1[pointer1];
                pointer1++;
            }
            else {
                current = nums2[pointer2];
                pointer2++;
            }
        }

        if (isOdd) return current;
        else return (previous + current) / 2.0;  
    }
}
