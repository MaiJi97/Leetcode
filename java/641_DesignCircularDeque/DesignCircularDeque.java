class MyCircularDeque {

    int capacity;
    int size;
    int[] queue;
    int front;
    int rear;

    public MyCircularDeque(int k) {
        this.queue = new int[k];
        this.capacity = k;
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }
    
    public boolean insertFront(int value) {
        if (isFull()) {
            return false;
        }
        front--;
        if (front < 0) front += capacity;
        queue[front] = value;
        size++;
        if (size == 1) rear = front;
        return true;
    }
    
    public boolean insertLast(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }
    
    public boolean deleteFront() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    
    public boolean deleteLast() {
        if (isEmpty()) {
            return false;
        }
        rear--;
        if (rear < 0) rear += capacity;
        size--;
        return true;
    }
    
    public int getFront() {
        return isEmpty() ? -1 : queue[front];
    }
    
    public int getRear() {
        return isEmpty() ? -1 : queue[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
