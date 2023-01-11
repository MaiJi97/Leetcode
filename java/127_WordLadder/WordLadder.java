class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<String> q = new ArrayDeque<>();
        HashSet<String> set = new HashSet<String>(wordList);
        HashSet<String> visited = new HashSet<>();
        q.offer(beginWord);
        visited.add(beginWord);
        int ret = 1;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                String current = q.poll();
                if (current.equals(endWord)) return ret;
                for (int j = 0; j < beginWord.length(); j++) {
                    for (char c = 'a'; c <= 'z'; c++) {
                        StringBuilder sb = new StringBuilder(current);
                        sb.setCharAt(j, c);
                        String newWord = sb.toString();
                        if (set.contains(newWord) && !visited.contains(newWord)) {
                            q.offer(newWord);
                            visited.add(newWord);
                        }
                    }
                }
            }
            ret++;
        }
        return 0;
    }
}
