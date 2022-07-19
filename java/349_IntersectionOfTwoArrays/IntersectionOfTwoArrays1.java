class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hs1 = new HashSet<>();
        HashSet<Integer> hs2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            hs1.add(nums1[i]);
        }
        
        for (int i = 0; i < nums2.length; i++) {
            if (hs1.contains(nums2[i])) {
                hs2.add(nums2[i]);
            }
        }
        
        int[] ret = new int[hs2.size()];
        int i = 0;
        
        for (int element : hs2) {
            ret[i] = element;
            i++;
        }
        return ret;
    }
}
