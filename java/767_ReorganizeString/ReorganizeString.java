class Solution {
    public String reorganizeString(String s) {
        if (s.length() == 0 || s.length() == 1) return s;
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Pair<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Character key : frequencies.keySet()) {
            pq.offer(new Pair(key, frequencies.get(key)));
        }
        StringBuilder sb = new StringBuilder();

        Pair pair = pq.poll();
        while (!pq.isEmpty()) {
            sb.append(pair.getKey());
            Pair next = pq.poll();
            int frequencyLeft = (int) pair.getValue() - 1;
            if (frequencyLeft > 0) {
                pq.offer(new Pair(pair.getKey(), frequencyLeft));
            }
            pair = next;
        }
        sb.append(pair.getKey());
        
        return (int)pair.getValue() > 1 ? "" : sb.toString();

    }
}
