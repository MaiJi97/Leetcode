class LRUCache {

    class Node {
        int key;
        int value;
        Node next;
        Node prev;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    int capacity;
    HashMap<Integer, Node> hm;
    Node head;
    Node tail;
    int size;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.hm = new HashMap<>();
        head = new Node(0, 0);
        tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if (!hm.containsKey(key)) {
            return -1;
        }
        else {
            Node node = hm.get(key);
            remove(key);
            addHead(key, node.value);
            return node.value;
        }
    }
    
    public void put(int key, int value) {
        if (hm.containsKey(key)) {
            remove(key);
            addHead(key, value);
        }
        else {
            addHead(key, value);
        }
    }

    public void remove(int key) {
        Node current = hm.get(key);
        Node next = current.next;
        Node prev = current.prev;
        prev.next = next;
        next.prev = prev;
        size--;
        hm.remove(key);
    }

    public void addHead(int key, int value) {
        Node node = new Node(key, value);
        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
        hm.put(key, node);
        size++;
        if (size > capacity) {
            Node preTail = tail.prev;
            remove(preTail.key);
        }
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
