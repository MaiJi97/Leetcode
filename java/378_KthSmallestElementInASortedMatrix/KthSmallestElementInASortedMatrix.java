class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int left = matrix[0][0];
        int right = matrix[matrix.length - 1][matrix[0].length - 1];
        while (left < right) {
            int mid = left + (right - left) / 2;
            int count = countEqualOrSmaller(matrix, mid);
            if (count >= k) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        }
        return left;
    }
    
    public int countEqualOrSmaller(int[][] matrix, int mid) {
        int row = 0;
        int col = matrix[0].length - 1;
        int count = 0;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] > mid) {
                col--;
            }
            else {
                row++;
                count += (col + 1);
            }
        }
        return count;
    }
}
