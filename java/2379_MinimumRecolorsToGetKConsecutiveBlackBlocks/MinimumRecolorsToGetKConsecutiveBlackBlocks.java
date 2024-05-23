class Solution {
    public int minimumRecolors(String blocks, int k) {
        int count = 0;
        for (int idx = 0; idx < k; idx++) {
            if (blocks.charAt(idx) == 'B') count++;
        }
        int ret = k - count;
        for (int i = 0; i < blocks.length() - k; i++) {
            if (blocks.charAt(i) == 'B') count--;
            if (blocks.charAt(i + k) == 'B') count++;
            ret = Math.min(ret, k - count);
        }
        return ret;
    }
}
