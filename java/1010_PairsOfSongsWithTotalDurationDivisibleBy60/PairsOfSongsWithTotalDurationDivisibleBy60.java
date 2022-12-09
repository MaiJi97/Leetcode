class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        Map<Integer, Integer> hm = new HashMap<>();
        int ret = 0;
        for (int i = 0; i < time.length; i++) {
            int reduced = time[i] % 60;
            int target = reduced == 0 ? 0 : 60 - reduced;
            ret += hm.getOrDefault(target, 0);
            hm.put(reduced, hm.getOrDefault(reduced, 0) + 1);
        }
        return ret;
    }
}
