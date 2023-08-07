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
    
    public void add(int key) { // O(n/k)
        int index = key % this.keyRange;
        this.bucketArray[index].add(key);
    }
    
    public void remove(int key) { // O(n/k)
        int index = key % this.keyRange;
        this.bucketArray[index].remove(key);
    }
    
    public boolean contains(int key) { // O(n/k)
        int index = key % this.keyRange;
        return this.bucketArray[index].contains(key);
    }
}

class Bucket {
    public LinkedList<Integer> container;

    public Bucket() {
        this.container = new LinkedList<>();
    }

    public void add(Integer key) { // O(n), add itself takes O(1)
        if (!this.container.contains(key)) this.container.addFirst(key);
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
