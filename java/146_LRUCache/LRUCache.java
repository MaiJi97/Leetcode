class Node {
    int key;
    int value;
    Node next;
    Node prev;

    public Node (int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    int capacity;
    int size;
    HashMap<Integer, Node> hm;
    Node head;
    Node tail;

   
    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.hm = new HashMap<>();
        this.head = new Node(0, 0);
        this.tail = new Node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        if (!hm.containsKey(key)) return -1; // if not contains, return -1
        int value = hm.get(key).value;
        remove(key);
        addHead(key, value);
        return value;
    }

    public void put(int key, int value) {
        if (hm.containsKey(key)) remove(key); // if contains, remove first and then add
        addHead(key, value);
    }

    public void remove(int key) {
        Node current = hm.get(key);
        Node prev = current.prev;
        Node next = current.next;
        prev.next = next;
        next.prev = prev;
        hm.remove(key);
        size--;
    }

    public void addHead(int key, int value) {
        if (size == capacity) remove(tail.prev.key);
        Node node = new Node(key, value);
        Node next = head.next;
        head.next = node;
        node.prev = head;
        node.next = next;
        next.prev = node;
        size++;
        hm.put(key, node);
    }

    
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
