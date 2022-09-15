class Solution {
    Map<String, Boolean> memo = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        if (s == "") {
            return true;
        }
        if (memo.containsKey(s)) {
            return memo.get(s);
        }
        boolean ret = false;
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                ret = wordBreak(s.substring(word.length()), wordDict);
            }
            memo.put(s, ret);
            if (ret) {
                break;
            }
        }
        return ret;
    }
}
