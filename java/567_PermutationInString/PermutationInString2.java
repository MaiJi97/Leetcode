class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] frequencies1 = new int[26];
        int[] frequencies2 = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            frequencies1[s1.charAt(i) - 'a']++;
            frequencies2[s2.charAt(i) - 'a']++;
        }
        int j = 0;
        for (int i = s1.length(); i < s2.length(); i++) {
            if (Arrays.equals(frequencies1, frequencies2)) return true;
            frequencies2[s2.charAt(j) - 'a']--;
            frequencies2[s2.charAt(i) - 'a']++;
            j++;
        }        
        return Arrays.equals(frequencies1, frequencies2);
    }
}
