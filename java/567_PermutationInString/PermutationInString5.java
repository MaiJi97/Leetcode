class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] frequencies = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            frequencies[s1.charAt(i) - 'a']++;
            frequencies[s2.charAt(i) - 'a']--;
        }
        if (allZeroes(frequencies)) return true;    
        for (int i = s1.length(); i < s2.length(); i++) {
            frequencies[s2.charAt(i) - 'a']--;
            frequencies[s2.charAt(i - s1.length()) - 'a']++;  
            if (allZeroes(frequencies)) return true;    
        }
        return false;
    }

    public boolean allZeroes(int[] array) {
        for (int i = 0; i < 26; i++) {
            if (array[i] != 0) return false;
        }
        return true;
    }

}
