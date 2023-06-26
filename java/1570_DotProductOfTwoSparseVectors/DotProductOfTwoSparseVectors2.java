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
        
        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < store.size() && pointer2 < vec.store.size()) {
            if (store.get(pointer1)[0] == vec.store.get(pointer2)[0]) {
                ret += store.get(pointer1)[1] * vec.store.get(pointer2)[1];
                pointer1++;
                pointer2++;
            }
            else if (store.get(pointer1)[0] < vec.store.get(pointer2)[0]) pointer1++;
            else pointer2++;
        }
        return ret;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);
