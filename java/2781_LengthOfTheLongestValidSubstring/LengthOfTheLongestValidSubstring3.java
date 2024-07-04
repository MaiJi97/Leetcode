class Solution {
    public int longestValidSubstring(String word, List<String> forbidden) {
        HashSet<String> hs = new HashSet<>();
        int max = 0;
        for (String e : forbidden) {
            hs.add(e);
            max = Math.max(max, e.length());
        }
        StringBuilder sb = new StringBuilder();
        int ret = 0;
        for (int i = 0; i < word.length(); i++) {
            sb.append(word.charAt(i));
            for (int j = sb.length() - 1; j >= Math.max(0, sb.length() - max); j--) {
                if (hs.contains(sb.toString().substring(j))) {
                    sb.delete(0, j + 1);
                    break;
                }
            }
            ret = Math.max(ret, sb.length());
        }
        return ret;
    }
}
