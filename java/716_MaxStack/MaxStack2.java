class MaxStack {

    public Stack<Integer> stack;
    public Stack<Integer> maxStack;

    public MaxStack() {
        this.stack = new Stack<>();
        this.maxStack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);
        if (maxStack.isEmpty()) {
            maxStack.push(x);
            return;
        }
        else {
            int max = Math.max(maxStack.peek(), x);
            maxStack.push(max);
        }
    }
    
    public int pop() {
        maxStack.pop();
        return stack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int peekMax() {
        return maxStack.peek();
    }
    
    public int popMax() {
        int ret = maxStack.peek();
        Stack<Integer> tempStack = new Stack<>();
        while(stack.peek() != ret){
            tempStack.push(stack.pop());
            maxStack.pop();
        }
        stack.pop();
        maxStack.pop();
        while(!tempStack.isEmpty()){
            this.push(tempStack.pop());
        }
        return ret;
    }
}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */
