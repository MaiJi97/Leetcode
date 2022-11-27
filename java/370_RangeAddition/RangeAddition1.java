class Solution {
    public int[] getModifiedArray(int length, int[][] updates) {
        int[] ret = new int[length];
        for (int[] update : updates) {
            int start = update[0];
            int end = update[1];
            while (start <= end) {
                ret[start] += update[2];
                start++;
            }
        }  
        return ret;
    }
}
