class Solution {
  
    public int findRadius(int[] houses, int[] heaters)  {
        Arrays.sort(heaters);
        int minRadius = 0; 
        for (int house : houses) {
            minRadius = Math.max(minRadius, binarySearch(house, heaters));
        }
        return minRadius;
    }

    public int binarySearch(int house, int[] heaters) {
        int left = 0;
        int right = heaters.length - 1;
        int min = Integer.MAX_VALUE;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            min = Math.min(min, Math.abs(house - heaters[mid]));
            if (heaters[mid] == house) return 0;
            else if (heaters[mid] < house) left = mid + 1;
            else right = mid - 1;
        }
        return min;
    }
}
