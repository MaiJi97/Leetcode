class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        int j = 0;
        int ret = -1;
        while (i < haystack.length()) {
            if (haystack.charAt(i) != needle.charAt(j)) i++;
            else {
                ret = i;
                while (i < haystack.length() && j < needle.length() && haystack.charAt(i) == needle.charAt(j)) {
                    i++;
                    j++;
                }
                if (j == needle.length()) {
                    return ret;
                }
                else {
                    i = ret + 1;
                    j = 0;
                    ret = -1;
                }
            }
        }
        return ret;
    }
}
