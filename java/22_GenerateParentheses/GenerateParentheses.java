class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        dfs(n, new String(), 0, 0, ret);
        return ret;
    }

    private void dfs(int n, String current, int open, int close, List<String> ret) {
        if (current.length() == n * 2) {
            ret.add(current);
            return;
        }
        if (open < n) dfs(n, current + '(', open + 1, close, ret);
        if (open > close) dfs(n, current + ')', open, close + 1, ret);
    }
}
