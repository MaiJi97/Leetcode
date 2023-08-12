class Solution {

    static TreeMap<Integer, String> hm = new TreeMap<>(Collections.reverseOrder());

    static {
        hm.put(1, "I");
        hm.put(5, "V");
        hm.put(10, "X");
        hm.put(50, "L");
        hm.put(100, "C");
        hm.put(500, "D");
        hm.put(1000, "M");
        hm.put(4, "IV");
        hm.put(9, "IX");
        hm.put(40, "XL");
        hm.put(90, "XC");
        hm.put(400, "CD");
        hm.put(900, "CM");

    }
    
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        while (num > 0) {
            for (int key : hm.keySet()) {
                if (num >= key) {
                    num -= key;
                    sb.append(hm.get(key));
                    break;
                }
            }
        }
        return sb.toString();
    }
}
