class Solution {
    public int numSub(String s) {
        if (s == null) {
            return 0;
        }
        int count = 0;
        int j = 1;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '1') {
                continue;
            }
            j = Math.max(j, i+1);
            while (j < s.length() && s.charAt(j) == '1') {
                j++;
            }
            count += j-i;
        }
        return count % 1000000007;
    }
}
