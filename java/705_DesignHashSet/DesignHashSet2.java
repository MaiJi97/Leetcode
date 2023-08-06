class MyHashSet {

    boolean[] set;

    public MyHashSet() {
        this.set = new boolean[1000001];
    }
    
    public void add(int key) { // O(n)
        set[key] = true;
    }
    
    public void remove(int key) { // O(n)
        set[key] = false;
    }
    
    public boolean contains(int key) { // O(n)
        return set[key] == true;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
