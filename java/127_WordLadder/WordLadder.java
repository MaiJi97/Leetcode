class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        HashSet<String> set = new HashSet<String>(wordList);
        Queue<String> queue = new ArrayDeque<>();
        HashSet<String> visited = new HashSet<>();
        visited.add(beginWord);
        queue.offer(beginWord);
        
        int length = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (word.equals(endWord)) {
                    return length;
                }
                for (int j = 0; j < word.length(); j++) {
                    for (char k = 'a'; k <= 'z'; k++) {
                        char[] newWordArr = word.toCharArray();
                        newWordArr[j] = (char)k;
                        String newWord = new String(newWordArr);
                        if (set.contains(newWord) && !visited.contains(newWord)) {
                            visited.add(newWord);
                            queue.add(newWord);
                        }
                    }
                }
            }
            length++;
        }
        return 0;
    }
}
