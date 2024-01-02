class Solution {
    public String reorganizeString(String s) {
        if (s.length() == 0 || s.length() == 1) return s;
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }
        PriorityQueue<Pair<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (char c : hm.keySet()) {
            pq.offer(new Pair<>(c, hm.get(c)));
        }
        StringBuilder sb = new StringBuilder();
        Pair<Character, Integer> pair = pq.poll();
        while (!pq.isEmpty()) {
            int frequency = pair.getValue();
            Pair<Character, Integer> next = pq.poll();
            sb.append(pair.getKey());
            if (frequency - 1 > 0) {
                pq.offer(new Pair<Character, Integer>(pair.getKey(), frequency - 1));
            }
            pair = next;
        }
        sb.append(pair.getKey());
        return pair.getValue() > 1 ? "" : sb.toString();
    }
}
