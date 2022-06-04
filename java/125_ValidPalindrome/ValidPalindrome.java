class Solution {
    public boolean isPalindrome(String s) {
        String cleanString = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                cleanString += s.charAt(i);
            }
        }
        cleanString = cleanString.toLowerCase();
        int left = 0;
        int right = cleanString.length() - 1;
        while (left < right) {
            if (cleanString.charAt(left) != cleanString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
