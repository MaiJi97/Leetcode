class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] s1Array = new int[26];
        int[] s2Array = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            s1Array[s1.charAt(i) - 'a'] += 1;
            s2Array[s2.charAt(i) - 'a'] += 1;
        }
        if (matches(s1Array, s2Array)) return true;
        for (int i = s1.length(); i < s2.length(); i++) {
            s2Array[s2.charAt(i) - 'a']++;
            s2Array[s2.charAt(i - s1.length()) - 'a']--;  
            if (matches(s1Array, s2Array)) return true;    
        }
        return false;
    }

    public boolean matches(int[] s1Array, int[] s2Array) {
        for (int i = 0; i < 26; i++) {
            if (s1Array[i] != s2Array[i]) return false;
        }
        return true;
    }

}
