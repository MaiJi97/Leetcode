class Solution {
    public int compress(char[] chars) {
        int j = 0;
        char current = chars[0];
        int count = 1;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] != chars[j]) {
                if (count >= 2) {
                    String countString = String.valueOf(count);
                    for (char c : countString.toCharArray()) {
                        j++;
                        chars[j] = c;
                    }
                }
                j++;
                count = 1;
                chars[j] = chars[i]; 
            }
            else count++;
        }
        if (count >= 2) {
            String countString = String.valueOf(count);
            for (char c : countString.toCharArray()) {
                j++;
                chars[j] = c;
            }
        }

        return j + 1;
        
    }
}
