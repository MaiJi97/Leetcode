class Solution {
    public String longestPalindrome(String s) {
        int maxlen = 0;
        String maxstr = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s.substring(i, j+1))) {
                    if((j + 1 - i) > maxlen){
                        maxlen = j + 1 - i;
                        maxstr = s.substring(i, j+1);
                    }
                }
            }
        }
        return maxstr;
    }
    
    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length()/2; i++){
            if (s.charAt(i) != s.charAt(s.length() - i - 1)){
                return false;
            }
        }
        return true;
    }
}
