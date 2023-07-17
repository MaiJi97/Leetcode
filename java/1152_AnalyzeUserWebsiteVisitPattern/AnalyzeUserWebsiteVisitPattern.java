class Pair {
    String website;
    int timestamp;
    public Pair (String website, int timestamp) {
        this.website = website;
        this.timestamp = timestamp;
    }
}

class Compare {
    String pattern;
    int freq;
    public Compare (String pattern, int freq) {
        this.pattern = pattern;
        this.freq = freq;
    }
}

class Solution {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        HashMap<String, List<Pair>> hm = new HashMap<>();
        for (int i = 0; i < username.length; i++) {
            if (!hm.containsKey(username[i])) { // can also use putIfAbsent
                hm.put(username[i], new ArrayList<>());
            }
            hm.get(username[i]).add(new Pair(website[i], timestamp[i]));
        }
        HashMap<String, Integer> freqMap = new HashMap<>();
        for (String user : hm.keySet()) {
            List<Pair> pairs = hm.get(user);
            Collections.sort(pairs, (a, b) -> a.timestamp - b.timestamp);
            Set<String> visited = new HashSet<>();
            dfs(pairs, freqMap, new ArrayList<>(), 0, visited);
        }    
        List<Compare> res = new ArrayList<>();
        for (String s : freqMap.keySet()) {
            res.add(new Compare(s, freqMap.get(s)));
        }
        Collections.sort(res, (n1, n2) -> n1.freq == n2.freq ? n1.pattern.compareTo(n2.pattern) : n2.freq - n1.freq);
        return new ArrayList<>(Arrays.asList(res.get(0).pattern.split("\\*")));
    }

    public void dfs(List<Pair> pairs, HashMap<String, Integer> freqMap, List<String> current, int index, Set<String> visited) {
        if (current.size() == 3) {
            String key = current.get(0) + "*" + current.get(1) + "*" + current.get(2);
            if (!visited.contains(key)) {
                freqMap.put(key, freqMap.getOrDefault(key, 0) + 1);
                visited.add(key);
            }           
            return;
        }
        for (int i = index; i < pairs.size(); i++) {
            current.add(pairs.get(i).website);
            dfs(pairs, freqMap, current, i+1, visited);
            current.remove(current.size() - 1);
        }
    }
}
