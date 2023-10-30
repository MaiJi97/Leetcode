class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> ret = new ArrayList<>();
        dfs(s, new ArrayList<>(), ret, 0);
        return ret;
    }

    private void dfs(String s, List<String> current, List<String> ret, int index) {
        if (index == s.length()) {
            if (current.size() == 4) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < current.size(); i++) {
                    sb.append(current.get(i));
                    if (i != 3) sb.append(".");
                }
                ret.add(sb.toString());
            }
            return;
        }
        for (int end = index; end < s.length() && end < index + 3; end++) {
            String sub = s.substring(index, end + 1);
            if (isValid(sub)) {
                current.add(sub);
                dfs(s, current, ret, end + 1);
                current.remove(current.size() - 1);
            }
        }
    }

    private boolean isValid(String s) {
        if (s.length() > 1 && s.charAt(0) == '0') return false;
        int num = Integer.valueOf(s);
        return num >= 0 && num <= 255;
    }
}
