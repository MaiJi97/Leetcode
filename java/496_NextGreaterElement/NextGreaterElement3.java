class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ret = new int[nums1.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = nums2.length-1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums2[i]) stack.pop();
            hm.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
            stack.push(nums2[i]);
        }
        for (int i = 0; i < nums1.length; i++) {
            ret[i] = hm.get(nums1[i]);
        }
        return ret;    
    }
}
