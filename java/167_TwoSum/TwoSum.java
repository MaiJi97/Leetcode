class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ret = new int[2];
        int left = 0; 
        int right = numbers.length-1;
        while (left <= right) {
            if (numbers[left] + numbers[right] == target) {
                ret[0] = left+1;
                ret[1] = right+1;
                return ret;
            }
            else if (numbers[left] + numbers[right] < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
