class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num : nums) {
            hs.add(num);
        }
        int ret = 0;
        for (int num : nums) {
            int current = num + 1;
            int count = 1;
            while (hs.contains(current)) {
                count++;
                current++;
            } 
            ret = Math.max(ret, count);
        }
        return ret;
        
    }
}
