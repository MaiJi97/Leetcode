class MyQueue {

    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    public MyQueue() {
 
    }
    
    public void push(int x) { // 6
        while (!s1.isEmpty()) { // s1: 5,4,3,2,1 
            s2.push(s1.pop()); // s2: 1,2,3,4,5
        }
        s2.push(x); // s2: 1,2,3,4,5,6
        while (!s2.isEmpty()) {
            s1.push(s2.pop()); // s1: 6,5,4,3,2,1
        }
    }
    
    public int pop() {
        if (s1.isEmpty()) {
            return -1;
        }
        return s1.pop();
    }
    
    public int peek() {
        if (s1.isEmpty()) {
            return -1;
        }
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
