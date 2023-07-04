class Solution {
    public int longestSubstring(String s, int k) {
        int ret = 0;
        for (int distinct = 1; distinct <= 26; distinct++) { // i distinct characters in the substring
            HashMap<Character, Integer> hm = new HashMap<>();
            int j = 0;
            int validCount = 0;
            for (int i = 0; i < s.length(); i++) {
                hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
                if (hm.get(s.charAt(i)) == k) validCount++;
                while (j <= i && hm.size() > distinct) {
                    if (hm.get(s.charAt(j)) == k) validCount--;
                    hm.put(s.charAt(j), hm.getOrDefault(s.charAt(j), 0) - 1);
                    if (hm.get(s.charAt(j)) == 0) hm.remove(s.charAt(j));
                    j++;
                }
                if (distinct == validCount) ret = Math.max(ret, i - j + 1);
            }
        }
        return ret;
    }
}
