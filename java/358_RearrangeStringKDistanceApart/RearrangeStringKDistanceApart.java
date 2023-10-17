class Solution {
    public String rearrangeString(String s, int k) {
        if (s.length() == 0 || s.length() == 1) return s;
        HashMap<Character, Integer> frequencies = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequencies.put(c, frequencies.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Pair<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        for (Character key : frequencies.keySet()) {
            pq.offer(new Pair(key, frequencies.get(key)));
        }

        HashMap<Character, Integer> hm = new HashMap<>();
        
        StringBuilder sb = new StringBuilder();

        Pair<Character, Integer> pair = pq.poll();

        while (!pq.isEmpty()) {
            ArrayList<Pair<Character, Integer>> temp = new ArrayList<>();
            hm.put(pair.getKey(), sb.length());
            sb.append(pair.getKey());
            while (!pq.isEmpty() && hm.containsKey(pq.peek().getKey()) && sb.length() - hm.get(pq.peek().getKey()) < k) {
                temp.add(pq.poll());
            }
            if (pq.isEmpty()) return ""; // cannot find the next character to append that satisfies k distance
            Pair<Character, Integer> next = pq.poll();
            int frequencyLeft = (int) pair.getValue() - 1;
            if (frequencyLeft > 0) {
                pq.offer(new Pair(pair.getKey(), frequencyLeft));
            }
            for (Pair p : temp) pq.offer(p);
            pair = next;
        }

        if (k == 0 || k == 1) {
            for (int i = 0; i < pair.getValue(); i++) sb.append(pair.getKey());
            return sb.toString();
        }
        else {
            sb.append(pair.getKey());
            return (int)pair.getValue() > 1 ? "" : sb.toString();
        }

    }
}
