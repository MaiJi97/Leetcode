class Solution {
    public int trap(int[] height) {
        int[] leftMax = new int[height.length];
        int[] rightMax = new int[height.length];
        int ret = 0; 

        leftMax[0] = height[0]; 
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = 1 ; i < height.length; i++) { 
            leftMax[i] = Math.max(height[i], leftMax[i - 1]); // 记录从index i处看到的左边最大高度（包括index i处的高度）
        }
        for (int i = height.length-2; i >= 0; i--) { 
            rightMax[i] = Math.max(height[i], rightMax[i + 1]); // 记录从index i处看到的右边最大高度（包括index i处的高度）
        }
        for (int i = 0; i < height.length; i++) {
            ret += (Math.min(leftMax[i], rightMax[i]) - height[i]);
        }
        return ret;
    }
}
