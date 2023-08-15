class Solution {
    public String minWindow(String s, String t) {
        // Example: t = "ABC", s = "ADOBECODEBANC"
        int[] map = new int[128];
        for (char c : t.toCharArray()) {
            map[c]++;
        }
        //          A B C 
        // count = [1,1,1,0,0,0...]
        
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
            while (count == 0) { // 在t中出现的所有char在当前部分的s中都出现且出现了一次（全部抵消）
                char lc = s.charAt(j);
                map[lc]++; // 准备滑动left pointer，对应的map[c]和count都要++
                if (map[lc] > 0) {
                    if (i - j + 1 < len) {
                        begin = j;
                        len = i - j + 1;
                    }
                    count++;
                }
                j++; // 滑动left pointer
            }
        }
        return len == Integer.MAX_VALUE ? "" : s.substring(begin, begin + len);
    }
}
