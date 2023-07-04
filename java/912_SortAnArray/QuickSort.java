class Solution {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length-1);
        return nums;
    }

    private void quickSort(int[] nums, int left, int right) {
        if (left >= right) return;
        int pivot = partition(nums, left, right); // partition后所有比pivot index小的element值都比pivot小，反之比其大
        quickSort(nums, left, pivot - 1);
        quickSort(nums, pivot + 1, right);
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
