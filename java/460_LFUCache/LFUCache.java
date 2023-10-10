class LFUCache {

    Map<Integer, Pair<Integer, Integer>> map; // <key, <value, frequency>>
    Map<Integer, LinkedHashSet<Integer>> freqMap; // <frequency, collection of keys with the frequency> 
    int capacity;
    int freqMin;

    public LFUCache(int capacity) {
        this.map = new HashMap<>();
        this.freqMap = new HashMap<>();
        this.capacity = capacity;
        this.freqMin = 0;
    }
    
    public int get(int key) {
        if (!map.containsKey(key)) return -1;

        int value = map.get(key).getKey();
        int frequency = map.get(key).getValue();

        freqMap.get(frequency).remove(key);

        if (freqMap.get(frequency).size() == 0) {
            freqMap.remove(frequency);
            if (freqMin == frequency) freqMin++;
        }

        insert(key, value, frequency + 1);
        return value;
    }
    
    public void put(int key, int value) {
        if (map.containsKey(key)) {
            Pair<Integer, Integer> temp = map.get(key);
            map.put(key, new Pair<>(value, temp.getValue()));
            get(key);
            return;
        }
        if (capacity == map.size()) {
            Set<Integer> keys = freqMap.get(freqMin);
            int keyToDelete = keys.iterator().next();
            map.remove(keyToDelete);
            keys.remove(keyToDelete);
            if (keys.isEmpty()) {
                freqMap.remove(freqMin);
            }
        }
        freqMin = 1;
        insert(key, value, 1);
    }

    public void insert(int key, int value, int frequency) {
        map.put(key, new Pair<>(value, frequency));
        if (!freqMap.containsKey(frequency)) freqMap.put(frequency, new LinkedHashSet<>());
        freqMap.get(frequency).add(key);
    }
}

/**
 * Your LFUCache object will be instantiated and called as such:
 * LFUCache obj = new LFUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
