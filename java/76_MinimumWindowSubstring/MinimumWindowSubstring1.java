class Solution {
    public String minWindow(String s, String t) {
        int[] frequencies = new int[128]; // since strings can contain both uppercase or lowercase letters
        int length = Integer.MAX_VALUE;
        int[] ret = new int[2];
        for (int i = 0; i < t.length(); i++) {
            frequencies[t.charAt(i)]++;
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i)]--;
            while (j <= i && checkValid(frequencies, t)) {
                if (i - j + 1 < length) {
                    length = i - j + 1;
                    ret[0] = j;
                    ret[1] = i;
                }
                frequencies[s.charAt(j)]++;
                j++;
            }
        }
        return length == Integer.MAX_VALUE ? "" : s.substring(ret[0], ret[1] + 1);
    }

    private boolean checkValid(int[] frequencies, String t) {
        for (int i = 0; i < t.length(); i++) {
            if (frequencies[t.charAt(i)] > 0) return false;
        }
        return true;
    }

}
