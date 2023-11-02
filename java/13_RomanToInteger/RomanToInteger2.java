class Solution {
    static HashMap<String, Integer> hm = new HashMap<>();

    static {
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);
    }

    public int romanToInt(String s) {

        int i = 0;
        int ret = 0;
        while (i < s.length()) {
            String currentSymbol = s.substring(i, i + 1);
            int currentValue = hm.get(currentSymbol);
            int nextValue = 0;
            if (i + 1 < s.length()) {
                String nextSymbol = s.substring(i + 1, i + 2);
                nextValue = hm.get(nextSymbol);
            }
            if (currentValue < nextValue) {
                ret += (nextValue - currentValue);
                i += 2;
            }  
            else {
                ret += hm.get(s.substring(i, i + 1));
                i++;
            } 
        }
        return ret;
    }
}
