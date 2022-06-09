class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ret = new ArrayList<>();;
        int left = 0;
        int right = arr.length - k;
        
        // ---|--------------x-----|--- 1st case
        // ---|-----x--------------|--- 2nd case
        
        while (left < right) {
            int mid = left + (right - left) / 2; // mid represents the left boundary of the k numbers
            if (x - arr[mid] > arr[mid+k] - x) { // 1st case
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        
        for (int i = 0; i < k; i++) {
            ret.add(arr[left + i]);
        }
        return ret;
    }
}
