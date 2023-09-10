class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty() || stack.peek()*asteroid > 0 || (stack.peek() < 0 && asteroid > 0)) stack.push(asteroid);
            else {
                boolean flag = false;
                while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) {
                    int other = stack.pop();
                    if (Math.abs(other) > Math.abs(asteroid)) asteroid = other;
                    else if (Math.abs(other) < Math.abs(asteroid)) continue;
                    else {
                        flag = true;
                        break;
                    }
                }
                if (flag == false) stack.push(asteroid);
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
