class TimeMap {

    HashMap<String, List<Object>> hm;

    public TimeMap() {
        this.hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if (!hm.containsKey(key)) hm.put(key, new ArrayList<>());
        this.hm.get(key).add(new Object(value, timestamp));
    }
    
    public String get(String key, int timestamp) {
        List<Object> list = hm.get(key);
        if (list == null) return "";
        int left = 0;
        int right = list.size() - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (list.get(mid).timestamp == timestamp) return list.get(mid).value;
            else if (list.get(mid).timestamp < timestamp) left = mid + 1;
            else {
                right = mid - 1;
            }
        }
        if (right < 0) return "";
        else return list.get(right).value;
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */

 class Object {
     String value;
     int timestamp;
     public Object(String value, int timestamp) {
         this.value = value;
         this.timestamp = timestamp;
     }

 }
