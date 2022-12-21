class MinStack {

    Stack<Integer> stack;
    Stack<int[]> minStack;

    public MinStack() {
        this.stack = new Stack<>();
        this.minStack = new Stack<>();
        minStack.push(new int[]{Integer.MAX_VALUE, 1});
    }
    
    public void push(int val) {
        stack.push(val);
        if (val < minStack.peek()[0]) {
            minStack.push(new int[]{val, 1});
        }
        else if (val == minStack.peek()[0]) {
            int temp = minStack.peek()[1];
            minStack.pop();
            minStack.push(new int[]{val, temp+1});
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        if (stack.peek() == minStack.peek()[0]) {
            if (minStack.peek()[1] == 1) {
                minStack.pop();
            }
            else {
                int[] temp = minStack.peek();
                minStack.pop();
                minStack.push(new int[]{temp[0], temp[1]-1});
            }
        }
        stack.pop();
    }
    
    public int top() {
        if (stack.isEmpty()) {
            return -1;
        }
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek()[0];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
