class Solution {
    public List<Integer> minAvailableDuration(int[][] slots1, int[][] slots2, int duration) {
        Arrays.sort(slots1, (a, b) -> a[0] - b[0]);
        Arrays.sort(slots2, (a, b) -> a[0] - b[0]);
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < slots1.length && pointer2 < slots2.length) {
            int start = Math.max(slots1[pointer1][0], slots2[pointer2][0]);
            int end = Math.min(slots1[pointer1][1], slots2[pointer2][1]);
            if (end - start >= duration) {
                return Arrays.asList(start, start+duration);
            }
            if (slots2[pointer2][1] < slots1[pointer1][1]) {
                pointer2++;
            }
            else {
                pointer1++;
            }
        }
        return Collections.emptyList();
    }
}
