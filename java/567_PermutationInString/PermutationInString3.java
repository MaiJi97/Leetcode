class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] s1Array = new int[26];
        for (char c : s1.toCharArray()) {
            s1Array[c - 'a'] += 1;
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            int[] s2Array = new int[26];
            String substring = s2.substring(i, i + s1.length());
            for (char c : substring.toCharArray()) {
                s2Array[c - 'a'] += 1;
            }
            if (matches(s1Array, s2Array)) return true; // can also use s1Array.equals(s2Array)
        }
        return false;
    }

    public boolean matches(int[] s1Array, int[] s2Array) 
        if (s1Array.length != s2Array.length) return false;
        for (int i = 0; i < s1Array.length; i++) {
            if (s1Array[i] != s2Array[i]) return false;
        }
        return true;
    }

}
