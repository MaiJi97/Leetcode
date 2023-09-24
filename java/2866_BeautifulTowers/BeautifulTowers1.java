class Solution {
    public long maximumSumOfHeights(List<Integer> maxHeights) {
        long ret = 0;
        for (int i = 0; i < maxHeights.size(); i++) {
            int currentIndex = i;
            long currentHeight = (long) maxHeights.get(i);
            long count = currentHeight;
            while (currentIndex >= 1) {
                currentHeight = Math.min(currentHeight, maxHeights.get(currentIndex - 1));
                count += currentHeight;
                currentIndex--;
            }
            currentIndex = i; 
            currentHeight = (long) maxHeights.get(i);
            while (currentIndex < maxHeights.size() - 1) {
                currentHeight = Math.min(currentHeight, maxHeights.get(currentIndex + 1));
                count += currentHeight;
                currentIndex++;
            }
            ret = Math.max(ret, count);
        }
        return ret;
    }
}
