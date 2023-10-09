class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        return dfs(s1, 0, s2, 0, s3, new StringBuilder());
    }

    public boolean dfs(String s1, int i, String s2, int j, String s3, StringBuilder current) {
        if (i == s1.length() && j == s2.length() && current.toString().equals(s3)) return true;
        else if (i == s1.length() && j == s2.length() && !current.toString().equals(s3)) return false;
        boolean temp = false;
        if (i < s1.length()) {
            temp |= dfs(s1, i + 1, s2, j, s3, current.append(s1.charAt(i)));
            current.deleteCharAt(current.length() - 1);
        }
        if (j < s2.length()) {
            temp |= dfs(s1, i, s2, j + 1, s3, current.append(s2.charAt(j)));
            current.deleteCharAt(current.length() - 1);
        }
        return temp;

    }
}
