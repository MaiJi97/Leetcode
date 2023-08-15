class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        HashMap<Character, Integer> hm1 = new HashMap<>();
        for (char c : s1.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            HashMap<Character, Integer> hm2 = new HashMap<>();
            String substring = s2.substring(i, i + s1.length());
            for (char c : substring.toCharArray()) {
                hm2.put(c, hm2.getOrDefault(c, 0) + 1); 
            } 
            if (matches(hm1, hm2)) return true; // can also use hm1.equals(hm2)
        }
        return false;
    }

    public boolean matches(HashMap<Character, Integer> s1map, HashMap<Character, Integer> s2map) {
        if (s1map.size() != s2map.size()) return false;
        for (char key : s1map.keySet()) {
            if (!s2map.containsKey(key) || !s1map.get(key).equals(s2map.get(key))) return false; // use equal not == because we are comparing objects
        }
        return true;
    }

}
