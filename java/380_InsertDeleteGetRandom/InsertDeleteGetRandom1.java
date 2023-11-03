class RandomizedSet {

    HashSet<Integer> hs;
    java.util.Random rand = new java.util.Random();

    public RandomizedSet() {
        this.hs = new HashSet<>();
    }
    
    public boolean insert(int val) {
       if (hs.contains(val)) return false;
       hs.add(val);
       return true;
    }
    
    public boolean remove(int val) {
        if (!hs.contains(val)) return false;
        hs.remove(val);
        return true;
    }
    
    public int getRandom() {
        Integer[] arr = hs.toArray(new Integer[hs.size()]);
        return arr[rand.nextInt(arr.length)];
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
