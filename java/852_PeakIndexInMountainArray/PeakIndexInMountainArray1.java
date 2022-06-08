class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr.length == 1) {
            return 0;
        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                return i-1;
            }
        }
        return arr.length - 1;
    }
}
