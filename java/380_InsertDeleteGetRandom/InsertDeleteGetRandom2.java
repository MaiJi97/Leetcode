class RandomizedSet {

    ArrayList<Integer> list; 
    HashMap<Integer, Integer> hm; // <element, index>
    java.util.Random rand = new java.util.Random();

    public RandomizedSet() {
        this.list = new ArrayList<>();
        this.hm = new HashMap<>(); 
    }
    
    public boolean insert(int val) {
       if (hm.containsKey(val)) return false;
       list.add(val);
       hm.put(val, list.size() - 1);
       return true;
    }
    
    public boolean remove(int val) {
        if (!hm.containsKey(val)) return false;
        swap(hm.get(val), list.size() - 1);
        list.remove(list.size() - 1);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
        int index = rand.nextInt(list.size());
        return list.get(index);
    }

    public void swap(int indexToRemove, int indexLast) {
        int elementToRemove = list.get(indexToRemove);
        int elementLast = list.get(indexLast);
        list.set(indexToRemove, elementLast);
        list.set(indexLast, elementToRemove);
        hm.put(elementToRemove, indexLast);
        hm.put(elementLast, indexToRemove);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
