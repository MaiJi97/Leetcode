class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>();
        for (String word : wordDict) hs.add(word);
        return dfs(s, hs);
    }

    public boolean dfs(String s, HashSet<String> hs) {
        if (hs.contains(s)) {
            memo.put(s, true);
            return true;
        }
        else if (memo.containsKey(s)) return memo.get(s);
        for (int i = 1; i < s.length(); i++) {
            if (hs.contains(s.substring(0, i)) && dfs(s.substring(i), hs)) {
                memo.put(s, true);
                return true;
            }
        }
        memo.put(s, false);
        return false;
    }
}
