class CustomStack {

    int[] arr;
    int capacity;
    int top;

    public CustomStack(int maxSize) {
        this.arr = new int[maxSize];
        this.capacity = maxSize;
        this.top = 0;
    }
    
    public void push(int x) {
        if (top == capacity) {
			return;
		}
		arr[top] = x;
		top++;
    }
    
    public int pop() {
        if (top == 0) {
			return -1;
		}
		int temp = arr[top-1];
        arr[top-1] = 0;
		top--;
		return temp;
    }
    
    public void increment(int k, int val) {
        int num = Math.min(k, top);
        for (int i = 0; i < num; i++) {
            arr[i] += val;
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */
