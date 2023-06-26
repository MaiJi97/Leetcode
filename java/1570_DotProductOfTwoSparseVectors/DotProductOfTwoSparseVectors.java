class SparseVector {

    HashMap<Integer, Integer> hm;
    
    SparseVector(int[] nums) {
        this.hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(i, nums[i]);
        }
    }
    
	// Return the dotProduct of two sparse vectors
    public int dotProduct(SparseVector vec) {
        int ret = 0;
        for (int key : hm.keySet()) {
            ret += hm.containsKey(key) ? hm.get(key) * vec.hm.get(key) : 0;
        }
        return ret;
    }
}

// Your SparseVector object will be instantiated and called as such:
// SparseVector v1 = new SparseVector(nums1);
// SparseVector v2 = new SparseVector(nums2);
// int ans = v1.dotProduct(v2);
