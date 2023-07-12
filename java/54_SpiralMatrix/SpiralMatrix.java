class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = m - 1;
        List<Integer> ret = new ArrayList<>();
        while (left <= right && top <= bottom) { // 每次while loop经历一个圈
            for (int i = left; i <= right; i++) { // 向右走
                ret.add(matrix[top][i]);
            } 
            top++;
            for (int i = top; i <= bottom; i++) { // 向下走
                ret.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) { // 向左走
                    ret.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) { // 向上走
                    ret.add(matrix[i][left]);
                }
            }
            left++;
        }
        return ret;
    }
}
