class MaxStack {

    public Stack<Integer> stack;
    public PriorityQueue<Integer> pq;

    public MaxStack() {
        this.stack = new Stack<>();
        this.pq = new PriorityQueue<>((a, b) -> b - a);
    }
    
    public void push(int x) {
        stack.push(x);
        pq.add(x); 
    }
    
    public int pop() {
        int ret = stack.pop();
        pq.remove(ret);
        return ret;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int peekMax() {
        return pq.peek();
    }
    
    public int popMax() {
        int ret = pq.poll();
        Stack<Integer> tempStack = new Stack<>();
        while(stack.peek() != ret){
            tempStack.push(stack.pop());
        }
        stack.pop();
        while(!tempStack.isEmpty()){
            stack.push(tempStack.pop());
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
