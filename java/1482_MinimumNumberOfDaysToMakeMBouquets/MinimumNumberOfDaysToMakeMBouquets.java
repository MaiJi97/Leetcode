class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if (bloomDay.length < m * k) return -1;
        int left = Integer.MAX_VALUE; // min value in bloomDay
        int right = Integer.MIN_VALUE; // max value in bloomDay
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] > right) {
                right = bloomDay[i];
            }
            if (bloomDay[i] < left) {
                left = bloomDay[i];
            }
        }

        int ret = -1;
        
        while (left <= right) { // pick m subarrays of length k, max of each subarray is minimized
            int mid = left + (right - left) / 2;
            // if (helper(bloomDay, mid, k) == m) return mid;
            if (helper(bloomDay, mid, k) < m) { // return number of subarray whose max value is mid (number of bouquets can be made on a given day)
                left = mid + 1;
            }
            else {
                ret = mid;
                right = mid - 1;
            }
        }
        return ret; 
    }
    
    public int helper(int[] bloomDay, int mid, int k) {
        int count = 0;
        int flowers = 0;
        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                flowers++;
                if (flowers == k) {
                    count++;
                    flowers = 0;
                }
            }
            else {
                flowers = 0;
            }
        }
        return count;
    }
}
