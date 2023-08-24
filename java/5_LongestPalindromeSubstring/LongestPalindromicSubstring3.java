class Solution {
    public String longestPalindrome(String s) {
        if (s.length() <= 1) {
            return s;
        }
        int maxlen = 1;
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int odd = findPalindrome(s, i, i);
            int even = findPalindrome(s, i, i + 1);
            int length = Math.max(odd, even);
            if (length > maxlen) {
                maxlen = length;
                start = i - (length - 1) / 2;
                end = i + length / 2;
            }
        }
        return s.substring(start, end+1);
    }

    public int findPalindrome(String s, int left, int right) {
        while (left >= 0 && right < s.length()) {
            if (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
            }
            else break;
        }
        right--;
        left++;
        return right - left + 1;
    }
}
