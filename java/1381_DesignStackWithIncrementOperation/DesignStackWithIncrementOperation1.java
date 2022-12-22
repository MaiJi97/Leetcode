class CustomStack {

    int[] arr;
    int capacity;
    int top;

    public CustomStack(int maxSize) {
        this.arr = new int[maxSize];
        this.capacity = maxSize;
        this.top = -1;
    }
    
    public void push(int x) {
        if (top == capacity - 1) {
		return;
	}
        top++;
	arr[top] = x;
    }
    
    public int pop() {
        if (top == -1) {
		return -1;
	}
	int temp = arr[top];
        arr[top] = 0;
	top--;
	return temp;
    }
    
    public void increment(int k, int val) {
        int num = Math.min(k, top+1);
        for (int i = 0; i < num; i++) {
            arr[i] += val;
        }
    }
}
