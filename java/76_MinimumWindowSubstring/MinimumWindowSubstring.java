class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        
        int begin = 0; 
        int count = t.length();
        int len = Integer.MAX_VALUE;
        int j = 0;
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map[c]--;
            if (map[c] >= 0) {
                count--;
            }
            while (count == 0) {
                char lc = s.charAt(j);
                map[lc]++;
                if (map[lc] > 0) {
                    if (i - j + 1 < len) {
                        begin = j;
                        len = i - j + 1;
                    }
                    count++;
                }
                j++;
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(begin, begin + len);
    }
}
