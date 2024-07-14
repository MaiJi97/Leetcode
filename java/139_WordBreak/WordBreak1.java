class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>();
        HashMap<String, Boolean> memo = new HashMap<>();
        for (String word : wordDict) hs.add(word);
        return dfs(s, hs, memo);
    }

    public boolean dfs(String s, HashSet<String> hs, HashMap<String, Boolean> memo) {
        if (s.length() == 0) {
            return true;
        }
        else if (memo.containsKey(s)) return memo.get(s);
        for (int i = 1; i <= s.length(); i++) {
            if (hs.contains(s.substring(0, i)) && dfs(s.substring(i), hs, memo)) {
                memo.put(s, true);
                return true;
            }
        }
        memo.put(s, false);
        return false;
    }
}
