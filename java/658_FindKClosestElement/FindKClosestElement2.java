class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ret = new ArrayList<>();;
        int low = 0;
        int high = arr.length - k;
        
        while (low < high) {
            int mid = low + (high - low) / 2; // mid represents the left boundary of the k numbers
            if (x - arr[mid] > arr[mid+k] - x) { 
                low = mid + 1;
            }
            else {
                high = mid;
            }
        }
        
        for (int i = 0; i < k; i++) {
            ret.add(arr[low + i]);
        }
        return ret;
    }
}
