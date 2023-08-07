class MyHashMap {

    private List<Bucket> bucketArray;
    private int keyRange;

    public MyHashMap() {
        this.keyRange = 2069;
        this.bucketArray = new ArrayList<>();
        for (int i = 0; i < this.keyRange; i++) {
            this.bucketArray.add(new Bucket());
        }
    }
    
    public void put(int key, int value) {
        int index = key % this.keyRange;
        bucketArray.get(index).put(key, value);
    }
    
    public void remove(int key) {
        int index = key % this.keyRange;
        bucketArray.get(index).remove(key);
    }

    public int get(int key) {
        int index = key % this.keyRange;
        return bucketArray.get(index).get(key);
    }
}

class Bucket {
    
    public List<Pair<Integer, Integer>> container;

    public Bucket() {
        this.container = new LinkedList<Pair<Integer, Integer>>();
    }

    public void put(Integer key, Integer value) { // O(n)
        boolean found = false;
        for (Pair<Integer, Integer> pair : this.container) {
            if (key.equals(pair.first)) {
                pair.second = value;
                found = true;
            }
        }
        if (found == false) this.container.add(new Pair<Integer, Integer>(key, value));
    }

    public void remove(Integer key) { // O(n)
        for (Pair<Integer, Integer> pair : this.container) {
            if (key.equals(pair.first)) {
                this.container.remove(pair);
                break;
            }
        }
    }

    public Integer get(Integer key) { // O(n)
        for (Pair<Integer, Integer> pair : this.container) {
            if (key.equals(pair.first)) return pair.second;
        }
        return -1;
        
    }
}

class Pair<U, V> {
    public U first;
    public V second;

    public Pair(U first, V second) {
        this.first = first;
        this.second = second;
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
