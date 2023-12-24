class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> frequencies = new HashMap<>(); // <element, frequencies>
        for (int i = 0; i < arr.length; i++) {
            frequencies.put(arr[i], frequencies.getOrDefault(arr[i], 0) + 1);
        }
        int[] bucketSort = new int[arr.length + 1];
        for (int key : frequencies.keySet()) {
            int frequency = frequencies.get(key);
            bucketSort[frequency]++;
        }
        int index = 0;
        int totalUnique = frequencies.size();
        while (index < bucketSort.length) {
            int numOfElement = bucketSort[index];
            for (int i = 0; i < numOfElement; i++) {
                if (k - index >= 0) {
                    k -= index;
                    totalUnique--;
                }
                else return totalUnique;
            }
            index++;
        }
        return totalUnique;
    }
}
