class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ret = new int[length];
        for (int[] update : updates) {
            ret[update[0]] += update[2];
            if (update[1] < length - 1) {
                ret[update[1] + 1] -= update[2];
            }
        }
        for (int i = 1; i < length; i++) {
            ret[i] = ret[i-1] + ret[i];
        }
        return ret;
    }
}
