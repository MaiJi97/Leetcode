class Solution {
    public int leastInterval(char[] tasks, int n) {

        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char task : tasks) {
            frequencies.put(task, frequencies.getOrDefault(task, 0) + 1);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (Character key : frequencies.keySet()) {
            pq.offer(frequencies.get(key));
        }

        int count = 0;

        while (!pq.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < n + 1; i++) { // one cycle, insert as many as tasks within this cycle
                if (!pq.isEmpty()) {
                    temp.add(pq.poll());
                }
            }
            for (int frequency : temp) {
                frequency--;
                if (frequency > 0) pq.add(frequency);
            }
            count += pq.isEmpty() ? temp.size() : n + 1;
        }
        return count;
        
    }
}
