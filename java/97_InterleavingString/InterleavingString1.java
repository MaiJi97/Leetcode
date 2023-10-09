class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) return false;
        return dfs(s1, 0, s2, 0, s3, "");
    }

    public boolean dfs(String s1, int i, String s2, int j, String s3, String current) {
        if (i == s1.length() && j == s2.length() && current.equals(s3)) return true;
        else if (i == s1.length() && j == s2.length() && !current.equals(s3)) return false;
        boolean temp = false;
        if (i < s1.length()) {
            temp |= dfs(s1, i + 1, s2, j, s3, current + s1.charAt(i));
        }
        if (j < s2.length()) {
            temp |= dfs(s1, i, s2, j + 1, s3, current + s2.charAt(j));
        }
        return temp;

    }
}
