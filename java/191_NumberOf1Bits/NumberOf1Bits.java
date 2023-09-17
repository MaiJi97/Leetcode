public class Solution {
    // you need to treat n as an unsigned value
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
