class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> list = new ArrayList<>();
        Arrays.sort(firstList, (a, b) -> a[0] - b[0]);
        Arrays.sort(secondList, (a, b) -> a[0] - b[0]);
        int pointer1 = 0;
        int pointer2 = 0;
        while (pointer1 < firstList.length && pointer2 < secondList.length) {
            int start = Math.max(firstList[pointer1][0], secondList[pointer2][0]);
            int end = Math.min(firstList[pointer1][1], secondList[pointer2][1]);
            if (end - start >= 0) {
                list.add(new int[]{start, end});
            }
            if (secondList[pointer2][1] < firstList[pointer1][1]) {
                pointer2++;
            }
            else {
                pointer1++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
}
