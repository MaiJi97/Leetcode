## Method 1: Two Pointers 同向双指针

Two pointers to iterate through the two arrays respectively, and another pointer to track the current index of the result array nums1. Note that all the pointers start from the end of the array and go from the largest to the smallest because we do not want to overwrite the values in nums1 from the beginning.

Time Complexity: O(n)
