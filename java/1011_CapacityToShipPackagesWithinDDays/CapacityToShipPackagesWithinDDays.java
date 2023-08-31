class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int left = 0;
        int right = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int countDays = countDays(weights, mid);
            if (countDays > days) left = mid + 1;
            else right = mid - 1;
        }
        return left;
    }

    private int countDays(int[] weights, int mid) {
        int sum = 0;
        int count = 1;
        for (int i = 0; i < weights.length; i++) {
            sum += weights[i];
            if (sum > mid) {
                count++;
                sum = weights[i];
            }
        }
        return count;
    }
}
