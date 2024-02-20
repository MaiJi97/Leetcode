class RandomizedSet {

    ArrayList<Integer> list; 
    HashMap<Integer, Integer> hm;
    int index;
    java.util.Random rand = new java.util.Random();

    public RandomizedSet() {
        this.list = new ArrayList<>();
        this.hm = new HashMap<>();
        this.index = 0;
    }
    
    public boolean insert(int val) {
       if (hm.containsKey(val)) return false;
       list.add(val);
       hm.put(val, index);
       index++;
       return true;
    }
    
    public boolean remove(int val) {
        if (!hm.containsKey(val)) return false;
        int lastElement = list.get(list.size() - 1);
        int valIndex = hm.get(val);
        list.set(valIndex, lastElement);
        list.remove(list.size() - 1);
        hm.put(lastElement, valIndex); // put first, in case there is only one element 
        hm.remove(val);
        index--;
        return true;
    }
    
    public int getRandom() {
        int index = rand.nextInt(list.size());
        return list.get(index);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
