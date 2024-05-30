class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        int ret = 1;
        for (int i = 3; i < n; i++) {
            boolean flag = false; // inner operation can also be wrapped into a helper method isPrime()
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag) ret++;
        }
        return ret;
    }
}
