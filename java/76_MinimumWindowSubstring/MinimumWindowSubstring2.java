class Solution {
    public String minWindow(String s, String t) {
        int[] frequencies = new int[128]; // since strings can contain both uppercase or lowercase letters
        int length = Integer.MAX_VALUE;
        int count = t.length();
        int start = 0;
        for (int i = 0; i < t.length(); i++) {
            frequencies[t.charAt(i)]++;
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            frequencies[s.charAt(i)]--;

            if (frequencies[s.charAt(i)] >= 0) count--; // 有效的抵消
            
            while (count == 0) { // 通过count来代替每次checkValid
                if (i - j + 1 < length) {
                    length = i - j + 1;
                    start = j;
                }
                if (frequencies[s.charAt(j)] >= 0) count++;
                frequencies[s.charAt(j)]++;  
                j++;

            }
        }
        return length == Integer.MAX_VALUE ? "" : s.substring(start, start + length);
    }

}
