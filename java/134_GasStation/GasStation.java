class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        // gain[i] = gas[i] - cost[i]: [-2, -2, -2, 3, 3]
        int totalGain = 0; 
        int currentGain = 0; 
        int ret = 0;
        for (int i = 0; i < gas.length; i++) {
            totalGain  += gas[i] - cost[i];
            currentGain += gas[i] - cost[i];
            // If we meet a "valley", start over from the next station
            // with 0 initial gas.
            if (currentGain < 0) {
                ret = i + 1;
                currentGain = 0;
            }
        }
        return totalGain < 0 ? -1 : ret;
    }
}
