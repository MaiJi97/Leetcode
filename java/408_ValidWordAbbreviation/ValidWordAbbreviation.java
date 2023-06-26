class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < word.length() && pointer2 < abbr.length()) {
            if (word.charAt(pointer1) == abbr.charAt(pointer2)) {
                pointer1++;
                pointer2++;
            }
            else if (abbr.charAt(pointer2) <= '0' || abbr.charAt(pointer2) > '9') return false; // if the char is not digit, or is 0
            else {
                StringBuilder sb = new StringBuilder();
                while (pointer2 < abbr.length() && Character.isDigit(abbr.charAt(pointer2))) {
                    sb.append(abbr.charAt(pointer2));
                    pointer2++;
                }
                int length = Integer.parseInt(sb.toString());
                pointer1 += length;
            }
        }
        return pointer1 == word.length() && pointer2 == abbr.length();
    }
}
