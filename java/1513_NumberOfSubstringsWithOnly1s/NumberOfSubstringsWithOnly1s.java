class Solution {
    public int numSub(String s) {
        int m = 1_000_000_007;
        int ret = 0;
        int count = 0;
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
                ret = (ret + count) % m;
            } else {
                count = 0;
            }
        }
        return ret % m; 
    }
}
