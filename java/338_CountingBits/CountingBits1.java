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
            int currentBit = n >> i;
            if ((currentBit & mask) == 1) count++;
        }
        return count;
    }
}
