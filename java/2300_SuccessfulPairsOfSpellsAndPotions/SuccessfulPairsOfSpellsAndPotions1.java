class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int[] ret = new int[spells.length];
        Arrays.sort(potions);
        for (int i = 0; i < spells.length; i++) {
            int left = 0;
            int right = potions.length;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if ((long)spells[i] * potions[mid] < success) left = mid + 1;
                else {
                    right = mid;
                }
            }
            ret[i] = potions.length - left;
        }
        return ret;
    }
}
