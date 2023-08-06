class MyHashSet {

    List<Integer> set;

    public MyHashSet() {
        this.set = new ArrayList<>();
    }
    
    public void add(int key) { // O(n)
        if (!set.contains(key)) set.add(key);
    }
    
    public void remove(int key) { // O(n)
        set.remove(Integer.valueOf(key));
    }
    
    public boolean contains(int key) { // O(n)
        return set.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
