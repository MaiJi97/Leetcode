class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] notPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                for (int j = 2 * i; j < n; j += i) notPrime[j] = true;
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) count++;
        }
        return count;
    }
}
