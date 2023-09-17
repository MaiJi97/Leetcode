class Solution {
    public int[] countBits(int n) {
        int[] ret = new int[n + 1];
        for (int num = 0; num <= n; num++) {
            ret[num] = hammingWeight(num);
        }
        return ret;
    }

    public int hammingWeight(int n) {
        int count = 0;
        int mask = 1;
        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) count++;
            mask = mask << 1; // 1 to 10 to 100...
        }
        return count;
    }
}
