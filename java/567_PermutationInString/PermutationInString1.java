class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            char[] s2Array = s2.substring(i, i + s1.length()).toCharArray();
            Arrays.sort(s2Array);
            if (compareCharArray(s1Array, s2Array)) return true; 
        }
        return false;
    }

    private boolean compareCharArray(char[] a1, char[] a2) { // can use built-in method Arrays.equals(a1, a2) instead
        int i = 0;
        int j = 0;
        while (i < a1.length && j < a2.length) {
            if (a1[i] != a2[j]) return false;
            i++;
            j++;
        }
        if (i == a1.length && j == a2.length) return true;
        else return false;
    }
}
