class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ret = 0;
        int j = 0;
        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            while (j < s.length() && hs.contains(s.charAt(i))) {
                hs.remove(s.charAt(j));
                j++;
            }
            hs.add(s.charAt(i));
            ret = Math.max(ret, i - j + 1);
        }
        return ret;
    }
}
