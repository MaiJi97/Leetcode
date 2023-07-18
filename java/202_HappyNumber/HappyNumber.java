class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet();
        while (n != 1) {
            int sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n /= 10;
            }
            if (hs.contains(sum)) return false;
            hs.add(sum);
            n = sum;
        }
        return true;
    }
}
