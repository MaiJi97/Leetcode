class Solution {
    public String alienOrder(String[] words) {
        Map<Integer, ArrayList<Integer>> graph = new HashMap<>();
        int[] inDegree = new int[26];

        HashSet<Character> vertices = new HashSet<>();
        for(String word : words)
            for(char c : word.toCharArray())
                vertices.add(c);

        for (int i = 0; i < 26; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < words.length - 1; i++) {
            String word1 = words[i];
            String word2 = words[i+1];
            int length = Math.min(word1.length(), word2.length());
            int count = 0;

            for (int j = 0; j < length; j++) {
                if (word1.charAt(j) != word2.charAt(j)) {
                    graph.get(word1.charAt(j) - 'a').add(word2.charAt(j) - 'a');
                    inDegree[word2.charAt(j) - 'a'] += 1;
                    break;
                }
                count++;
            }
            if (count == length && word1.length() > word2.length()) return "";
        }

        Queue<Integer> q = new ArrayDeque<>();
        for (int i = 0; i < 26; i++) {
            if (inDegree[i] == 0) {
                q.offer(i); // 将每个in degree为0的点放入queue中作为起始点
            }
        }

        List<Character> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int current = q.poll(); // 拿出一个点并去掉所有连边，in degree - 1
            char c = (char) (current + 'a');
            if (vertices.contains(c)) topo.add(c); // must use hashset instead of checking hashmap value size, since there might be character that appears but with 0 in degree
            for (int neighbor : graph.get(current)) {
                inDegree[neighbor]--;
                if (inDegree[neighbor] == 0) { // 一旦发现新的in degree为0的点，丢入queue中
                    q.offer(neighbor);
                }
            }
        }

        if (topo.size() != vertices.size()) topo = new ArrayList<>();

        StringBuilder sb = new StringBuilder();
        for(char c : topo)
            sb.append(c);
        return sb.toString();

    }
}
