class MyHashSet {

    private Bucket[] bucketArray;
    private int keyRange;

    public MyHashSet() {
        this.keyRange = 769;
        this.bucketArray = new Bucket[this.keyRange];
        for (int i = 0; i < this.keyRange; i++) {
            this.bucketArray[i] = new Bucket();
        }
    }
    
    public void add(int key) { // O(1)
        int index = key % this.keyRange;
        bucketArray[index].add(key);
    }
    
    public void remove(int key) { // O(n)
        int index = key % this.keyRange;
        bucketArray[index].remove(key);
    }
    
    public boolean contains(int key) { // O(n)
        int index = key % this.keyRange;
        return bucketArray[index].contains(key);
    }
}

class Bucket {
    public LinkedList<Integer> container;

    public Bucket() {
        this.container = new LinkedList<>();
    }

    public void add(Integer key) { // O(1)
        if (!container.contains(key)) this.container.addFirst(key);
    }

    public void remove(Integer key) { // O(n)
        this.container.remove(key);
    }

    public boolean contains(Integer key) { // O(n)
        return this.container.contains(key);
        
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
