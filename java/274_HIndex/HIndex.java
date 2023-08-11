class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations); // [0, 1, 3, 5, 6]
        int hIndex = 0;
        while (hIndex < Math.min(citations.length, citations[citations.length - 1]) && citations[citations.length - 1 - hIndex] >= hIndex) hIndex++;
        return hIndex;
    }
}
