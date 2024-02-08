class MaxStack {
    class Node {
        int val;
        int id;
        Node prev;
        Node next;
        public Node(int val) {
            this.val = val;
        }
        public Node(int val, int id) {
            this.val = val;
            this.id = id;
        }
    }

    PriorityQueue<Node> pq;
    Node top;
    Node bottom;
    int id = 0;

    // always init head and tail nodes for doubly linked list
    public MaxStack() {
        this.top = new Node(-1);
        this.bottom = new Node(-1);
        top.next = bottom;
        bottom.prev = top;
        this.pq = new PriorityQueue<>((a, b) -> a.val == b.val ? b.id - a.id : b.val - a.val);
    }

    /*
        Doubly Linked List operations O(1)
        maxheap.add() O(logn)
    */  
    public void push(int x) {
        Node node = new Node(x, id);
        Node next = top.next; 
        top.next = node; // top points to node we are adding
        node.next = next; // node -> the old element after top
        next.prev = node; // the old element after top -> node
        node.prev = top; // node -> top
        id++; // increase id counter
        pq.add(node);
    }
    
    /*
        Doubly Linked List operations O(1)
        maxheap.remove() O(logn)
    */
    public int pop() {
        Node node = top.next;
        top.next = node.next; // top -> skip to next top element
        node.next.prev = top; // next top element -> top
        pq.remove(node); // search and remove node
        return node.val;
    }
    
    // O(1)
    public int top() {
        return top.next.val;
    }
    
    // O(1)
    public int peekMax() {
        return pq.peek().val;
    }
    
    /*
        Doubly Linked List operations O(1)
        maxHeap.poll() O(logn)
    */
    public int popMax() {
        Node node = pq.poll(); // get max from maxHeap
        Node nodeAbove = node.prev; 
        nodeAbove.next = node.next;
        node.next.prev = nodeAbove;
        return node.val;
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
