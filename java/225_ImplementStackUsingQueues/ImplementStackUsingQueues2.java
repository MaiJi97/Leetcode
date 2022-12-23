class MyStack {

    Queue<Integer> q = new ArrayDeque<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        q.offer(x);
        int size = q.size();
        while (size > 1) {
            q.offer(q.poll());
            size--;
        }
    }
    
    public int pop() { 
        if (q.isEmpty()) {
            return -1;
        }
        return q.poll();
    }
    
    public int top() {
        if (q.isEmpty()) {
            return -1;
        }
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
