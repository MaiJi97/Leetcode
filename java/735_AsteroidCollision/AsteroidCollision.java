class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int current = asteroids[i];
            if (stack.isEmpty() || stack.peek() * current > 0 || (stack.peek() < 0 && current > 0)) stack.push(current);
            else {
                boolean flag = true;
                while (!stack.isEmpty() && stack.peek() > 0 && current < 0) {
                    int previous = stack.pop();
                    int update = 0;
                    if (Math.abs(current) > Math.abs(previous)) update = current;
                    else if (Math.abs(current) < Math.abs(previous)) update = previous;

                    if (update == 0) {
                        flag = false;
                        break;
                    }
                    else {
                        current = update;
                    }
                }
                if (flag == true) stack.push(current);
            }
        }
        int[] ret = new int[stack.size()];
        int index = stack.size() - 1;
        while (!stack.isEmpty()) {
            ret[index] = stack.pop();
            index--;
        }
        return ret;
    }
}
