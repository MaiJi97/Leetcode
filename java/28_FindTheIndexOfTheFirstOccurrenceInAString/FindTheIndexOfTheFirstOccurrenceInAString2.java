class Solution {
    public int strStr(String haystack, String needle) {
        int i = 0;
        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.length() - i >= needle.length() && needle.equals(haystack.substring(i, i + needle.length()))) {
                    return i;
                }
                i++;
            } 
            else i++;
        }
        return -1;
    }
}
