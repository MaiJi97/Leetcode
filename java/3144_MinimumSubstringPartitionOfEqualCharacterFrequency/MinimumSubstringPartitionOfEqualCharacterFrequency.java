class Solution {

    public int minimumSubstringsInPartition(String s) {
        int[] memo = new int[s.length()];
        Arrays.fill(memo,-1);
        return dfs(s, 0, memo);
    }

    public int dfs(String s, int index, int[] memo) {
        if (index == s.length()) return 0;
        else if (memo[index] != -1) return memo[index];
        int[] freq = new int[26];
        int ret = Integer.MAX_VALUE;
        for (int i = index; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            if (isBalanced(freq)) {
                ret = Math.min(ret, 1 + dfs(s, i + 1, memo));
            }
        }
        memo[index] = ret;
        return memo[index];
    }

    public boolean isBalanced(int[] freq) {
        int count = 0;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == 0) continue;
            else if (freq[i] != 0) {
                if (count == 0) {
                    count = freq[i];
                }
                else {
                    if (freq[i] != count) return false;
                }
            }
        }
        return true;
    }
}
