class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        int maxCount = 0;
        int j = 0;
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'A'] += 1;
            maxCount = Math.max(maxCount, freq[s.charAt(i) - 'A']); // two pointers之间出现最多的char出现的次数
            while (maxCount + k < i - j + 1) { // 需要replace的大于k, can also use if statement here because maxCount increment one by one
                freq[s.charAt(j) - 'A']--;
                j++;
            }
            ret = Math.max(ret, i - j + 1);
        }
        return ret;
    }
}
