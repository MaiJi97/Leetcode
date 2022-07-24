class Solution {
    public int characterReplacement(String s, int k) {
        int left = 0;
        int right = 0;
        int[] freq = new int[26];
        
        int maxCount = 0;
        
        while (right < s.length()) { // 循环得出left-right区间的string为最终结果向哟啊的string
            freq[s.charAt(right) - 'A']++; // 记录right pointer指向的字母出现的次数
            maxCount = Math.max(maxCount, freq[s.charAt(right) - 'A']); // 得到出现次数最多的字母出现的次数
            right++;
            
            if (right - left > maxCount + k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }
        }
        return right - left;
    }
}
