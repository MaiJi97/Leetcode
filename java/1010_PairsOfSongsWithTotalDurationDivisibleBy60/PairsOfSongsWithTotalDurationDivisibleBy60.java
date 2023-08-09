class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        HashMap<Integer, Integer> hm = new HashMap<>(); // <remainder, frequncies>
        int count = 0;
        for (int i = 0; i < time.length; i++) {
            int remainder = time[i] % 60;
            int other = remainder == 0 ? 0 : 60 - remainder;
            if (hm.containsKey(other)) {
                count += hm.get(other);
            }
            hm.put(remainder, hm.getOrDefault(remainder, 0) + 1);
        }
        return count;
    }
}
