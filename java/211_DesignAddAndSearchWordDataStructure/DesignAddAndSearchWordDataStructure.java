class WordDictionary {

    TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }
    
    public void addWord(String word) {
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
        return helper(word, node, 0);
    }

    public boolean helper(String word, TrieNode node, int index) {
        if (index == word.length()) {
            return node.isWord;
        }
        char c = word.charAt(index);
        if (c != '.') return node.children[c - 'a'] != null && helper(word, node.children[c - 'a'], index + 1);
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null && helper(word, node.children[i], index + 1)) {
                return true;
            } 
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */

 class TrieNode {

     boolean isWord;
     TrieNode[] children;

     public TrieNode() {
         this.children = new TrieNode[26];
     }
 }
