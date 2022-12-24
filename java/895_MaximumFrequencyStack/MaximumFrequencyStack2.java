class FreqStack {

    Map<Integer, Integer> map; // <element, frequency>
    Map<Integer, Stack<Integer>> group; // <frequency, stack of elements of frequency>
    int maxFreq;

    public FreqStack() {
        this.map = new HashMap<>();
        this.group = new HashMap<>();
        this.maxFreq = 0;
    }
    
    public void push(int x) {
        int f = map.getOrDefault(x, 0) + 1;
        map.put(x, f);
        if (f > maxFreq) maxFreq = f;
        group.computeIfAbsent(f, z -> new Stack<>()).push(x);
    }
    
    public int pop() {
        int temp = group.get(maxFreq).pop();
        map.put(temp, map.get(temp) - 1);
        if (group.get(maxFreq).size() == 0) {
            maxFreq--;
        }
        return temp;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
