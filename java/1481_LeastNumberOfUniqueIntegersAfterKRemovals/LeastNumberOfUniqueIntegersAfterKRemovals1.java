class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        List<Integer>[] bucketSort = new List[arr.length + 1];
        for (int key : hm.keySet()) {
            int frequency = hm.get(key);
            if (bucketSort[frequency] == null) {
                List<Integer> list = new ArrayList<>();
                bucketSort[frequency] = list;
            }
            bucketSort[frequency].add(key);
        }
        int totalUnique = hm.size();
        for (int i = 0; i < bucketSort.length; i++) {
            if (bucketSort[i] != null) {
                for (int j = 0; j < bucketSort[i].size(); j++) {
                    if (k - i >= 0) {
                        k -= i;
                        totalUnique--;
                    }
                    else break;
                }
            }
        }
        return totalUnique;
    }
}
