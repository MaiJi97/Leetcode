class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length - 1;
        int ret = 0;
        while (left <= right) {
            if (people[left] + people[right] <= limit) {
                ret++;
                left++;
                right--;
            }
            else {
                ret++;
                right--;
            }
        }
        return ret;
    }
}
