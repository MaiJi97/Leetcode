class FreqStack {

    PriorityQueue<int[]> pq;
    Map<Integer, Integer> map;
    int pushCount;

    public FreqStack() {
        this.pq = new PriorityQueue<>((a, b) -> b[1] == a[1] ? b[2] - a[2] : b[1] - a[1]);
        this.map = new HashMap<>();
        this.pushCount = 0;
    }
    
    public void push(int x) {
        pq.add(new int[]{x, map.getOrDefault(x, 0) + 1, pushCount});
        map.put(x, map.getOrDefault(x, 0) + 1);
        pushCount++;
    }
    
    public int pop() {
        if (pq.isEmpty()) {
            return -1;
        };
        int[] temp = pq.poll();
        map.put(temp[0], map.get(temp[0]) - 1);
        return temp[0];
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
