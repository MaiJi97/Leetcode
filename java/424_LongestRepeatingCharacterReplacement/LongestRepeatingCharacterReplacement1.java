class Solution {
    public int characterReplacement(String s, int k) {
        int[] frequencies = new int[26];
        int maxCount = 0;
        int j = 0;
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i) - 'A']++;
            maxCount = getMax(frequencies);
            while (maxCount + k < i - j + 1) {
                frequencies[s.charAt(j) - 'A']--;
                j++;
            }
            ret = Math.max(ret, i - j + 1);
        }
        return ret;
    }

    public int getMax(int[] frequencies) {
        int ret = 0;
        for (int freq : frequencies) {
            ret = Math.max(ret, freq);
        }
        return ret;
    }
}
