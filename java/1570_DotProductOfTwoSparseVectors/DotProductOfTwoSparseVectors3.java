class SparseVector {

    List<int[]> store;
    
    SparseVector(int[] nums) {
        this.store = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                store.add(new int[]{i, nums[i]});
            }
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int ret = 0;
        
        for (int i = 0; i < store.size(); i++) {
            int index = store.get(i)[0];
            int value = store.get(i)[1];

            int vecIndex = binarySearch(vec.store, index);

            if (vecIndex != -1) ret += value * vec.store.get(vecIndex)[1];
        }
  
        return ret;
    }

    private int binarySearch(List<int[]> store, int targetIndex) {
        int left = 0;
        int right = store.size() - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (store.get(mid)[0] == targetIndex) return mid;
            else if (store.get(mid)[0] < targetIndex) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);
