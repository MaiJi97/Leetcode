class Solution {
    public int lengthOfLongestSubstringKDistinct(String s, int k) {
        int count = 0;
        HashMap<Character, Integer> hm = new HashMap<>();
        int j = 0;
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            while (j <= i && hm.size() > k) {
                hm.put(s.charAt(j), hm.get(s.charAt(j)) - 1);
                if (hm.get(s.charAt(j)) == 0) hm.remove(s.charAt(j));
                j++;
            }
            ret = Math.max(ret, i - j + 1);
        }
        return ret;
    }
}
