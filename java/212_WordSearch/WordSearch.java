class Solution {

    HashSet<String> ret = new HashSet<>();

    public List<String> findWords(char[][] board, String[] words) {
        
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }

        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dfs(board, visited, trie, i, j, "");
            }
        }
        return new ArrayList<>(ret);
    }

    public void dfs(char[][] board, boolean[][] visited, Trie trie, int i, int j, String current) {

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j]) return;

        current += board[i][j];

        if (!trie.startsWith(current)) return;

        if (trie.search(current)) ret.add(current);

        visited[i][j] = true;
        
        dfs(board, visited, trie, i+1, j, current);
        dfs(board, visited, trie, i-1, j, current);
        dfs(board, visited, trie, i, j+1, current);
        dfs(board, visited, trie, i, j-1, current);

        visited[i][j] = false;
    }
}

class Trie {

    TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) {
                node.children[c - 'a'] = new TrieNode();
            }
            node = node.children[c - 'a'];
        }
        node.isWord = true;
    }
    
    public boolean search(String word) {
        TrieNode node = root;
        for (char c : word.toCharArray()) {
            if (node.children[c - 'a'] == null) return false;
            else node = node.children[c - 'a'];
        }
        return node.isWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char c : prefix.toCharArray()) {
            if (node.children[c - 'a'] == null) return false;
            else node = node.children[c - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

 class TrieNode {
     boolean isWord;
     TrieNode[] children;
     public TrieNode() {
         this.children = new TrieNode[26];
     }
 }
