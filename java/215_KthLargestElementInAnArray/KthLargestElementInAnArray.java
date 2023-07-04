class Solution {
    public int findKthLargest(int[] nums, int k) {
        quickSort(nums, 0, nums.length - 1, k);
        return nums[nums.length - k];
        
    }

    private void quickSort(int[] nums, int left, int right, int k) {
        if (left >= right) return;
        int pivot = partition(nums, left, right); // partition后所有比pivot index小的element值都比pivot小，反之比其大
        if (pivot == nums.length - k) return;
        else if(pivot >= nums.length - k) quickSort(nums, left, pivot - 1, k);
        else quickSort(nums, pivot + 1, right, k);
    }

    private int partition(int[] nums, int left, int right) {
        int pivot = nums[right];
        int start = left;
        int end = right - 1;
        while (start <= end) {
            if (nums[start] <= pivot) start++;
            else if (nums[end] > pivot) end--;
            else {
                swap(nums, start, end);
                start++;
                end--;
            }
        }
        swap(nums, start, right);
        return start;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
