class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        HashSet<String> hs = new HashSet<>();
        for (String word : wordDict) hs.add(word);
        List<String> ret = new ArrayList<>();
        dfs(s, hs, "", ret);
        return ret;
    }

    public void dfs(String s, HashSet<String> hs, String current, List<String> ret) {
        if (s.length() == 0) {
            ret.add(current.substring(0, current.length() - 1));
            return;
        }
        for (int i = 1; i <= s.length(); i++) {
            if (hs.contains(s.substring(0, i))) {
                dfs(s.substring(i), hs, current + s.substring(0, i) + " ", ret);
            }
        }
    }
}
