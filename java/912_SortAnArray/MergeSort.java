class Solution {
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length-1);
    }
    
    public int[] mergeSort(int[] nums, int start, int end) {
        int mid = start + (end - start) / 2;
        if (start == end) {
            return new int[]{nums[end]};
        }
        int[] left = mergeSort(nums, start, mid);
        int[] right = mergeSort(nums, mid + 1, end);
        return merge(left, right);
    }
    
    public int[] merge(int[] left, int[] right) {
        int[] ret = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                ret[k] = left[i];
                i++;
            }
            else {
                ret[k] = right[j];
                j++;
            }
            k++;
        }
        
        while (i < left.length) {
            ret[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            ret[k] = right[j];
            j++;
            k++;
        }
        return ret;
    }
}
