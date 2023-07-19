class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ret = new ArrayList<>();
        dfs(n, new StringBuilder(), 0, 0, ret);
        return ret;
    }

    private void dfs(int n, StringBuilder current, int open, int close, List<String> ret) {
        if (current.length() == n * 2) {
            ret.add(current.toString());
            return;
        }
        if (open < n) {
            dfs(n, current.append('('), open + 1, close, ret);
            current.deleteCharAt(current.length() - 1);
        }
        if (open > close) {
            dfs(n,current.append(')'), open, close + 1, ret);
            current.deleteCharAt(current.length() - 1);
        }
    }
}
