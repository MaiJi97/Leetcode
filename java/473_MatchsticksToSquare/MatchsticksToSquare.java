class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int length : matchsticks) sum += length;
        if (sum % 4 != 0) return false;
        int side = sum / 4;
        Arrays.sort(matchsticks);
        return dfs(matchsticks, new int[4], side, matchsticks.length - 1);
    }

    private boolean dfs(int[] matchsticks, int[] currentSides, int side, int index) {
        if (index == -1) {
            if (sidesSatisfied(currentSides, side)) return true;
            else return false;
        }
        for (int i = 0; i < 4; i++) {
            if (currentSides[i] + matchsticks[index] > side) continue;
            currentSides[i] += matchsticks[index];
            if (dfs(matchsticks, currentSides, side, index - 1)) return true;
            currentSides[i] -= matchsticks[index];
        }  
        return false;
    }

    private boolean sidesSatisfied(int[] currentSides, int side) {
        for (int s : currentSides) {
            if (s != side) return false;
        }
        return true;
    }
}
