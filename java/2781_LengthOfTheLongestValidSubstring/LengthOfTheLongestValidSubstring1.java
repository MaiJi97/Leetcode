class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        HashSet<String> hs = new HashSet<>();
        for (String e : forbidden) hs.add(e);
        StringBuilder sb = new StringBuilder();
        int ret = 0;
        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i));
            while (sb.length() > 0 && contains(sb.toString(), hs)) {
                sb.deleteCharAt(0);
            }
            ret = Math.max(ret, sb.length());
        }
        return ret;
    }

    private boolean contains(String s, HashSet<String> hs) {
        for (int i = 0; i < s.length(); i++) {
            if (hs.contains(s.substring(i))) return true;
        }
        return false;
    }
}
