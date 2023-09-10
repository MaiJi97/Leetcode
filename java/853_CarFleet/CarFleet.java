class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int[][] dist = new int[position.length][2];
        for (int i = 0; i < position.length; i++) {
            dist[i][0] = position[i];
            dist[i][1] = speed[i];
        }
        Arrays.sort(dist, (a, b) -> a[0] - b[0]);
        for (int i = position.length - 1; i >= 0; i--) {
            double timeToDestiny = (double)(target - dist[i][0]) / dist[i][1];
            if (!stack.isEmpty() && stack.peek() >= timeToDestiny) continue;
            else stack.push(timeToDestiny);
        }
        return stack.size();
    }
}
