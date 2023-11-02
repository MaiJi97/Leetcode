class Solution {
    static HashMap<Character, Integer> hm = new HashMap<>();

    static {
        hm.put('I', 1);
        hm.put('V', 5);
        hm.put('X', 10);
        hm.put('L', 50);
        hm.put('C', 100);
        hm.put('D', 500);
        hm.put('M', 1000);
    }

    public int romanToInt(String s) {

        int i = 0;
        int ret = 0;
        while (i < s.length()) {
            if (i != s.length() - 1) {
                if (s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X')) {
                    ret += hm.get(s.charAt(i + 1)) - hm.get(s.charAt(i));
                    i += 2;
                }
                else if (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C')) {
                    ret += hm.get(s.charAt(i + 1)) - hm.get(s.charAt(i));
                    i += 2;
                }
                else if (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                    ret += hm.get(s.charAt(i + 1)) - hm.get(s.charAt(i));
                    i += 2;
                }
                else {
                    ret += hm.get(s.charAt(i));
                    i++;
                }
            }
            else {
                ret += hm.get(s.charAt(i));
                i++;
            }
        }
        return ret;
    }
}
