class Solution {
    public int maxArea(int[] height) {
        int ret = 0;
        int left = 0; 
        int right = height.length - 1;
        while (left < right) {
            int water = (right - left) * (Math.min(height[left], height[right]));
            if (height[left] > height[right]) {
                right--;
            }
            else {
                left++;
            }
            if (water > ret) {
                ret = water;
            }
        }
        return ret;
    }
}
