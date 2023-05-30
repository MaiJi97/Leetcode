class Solution {
    public int findMaximumXOR(int[] nums) {
        int ret = Integer.MIN_VALUE;
        Trie trie = new Trie();
        for (int num : nums) {
            trie.insert(num);
        }
        for (int num : nums) {
            TrieNode node = trie.root;
            int sum = 0;
            for (int i = 31; i >= 0; i--) {
                int currentBit = (num >> i) & 1; // ith bit
                // if currentBit is 0, otherBit is 1; if currentBit is 1, otherBit is 0
                int otherBit = currentBit == 1 ? 0 : 1; 
                // if no matching, continue traversing through the num bit node's path until we find a matching path
                if (node.children[otherBit] == null) {
                    node = node.children[currentBit];
                } 
                // if matching, stick with and continue traversing through other bit node's path
                else {
                    sum += (1 << i);
                    node = node.children[otherBit];
                }
            }
            ret = Math.max(ret, sum);
        }
        return ret;
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        this.root = new TrieNode();
    }

    public void insert(int num) {
        TrieNode node = root;
        for (int i = 31; i >= 0; i--) {
            int currentBit = (num >> i) & 1;
            if (node.children[currentBit] == null) {
                node.children[currentBit] = new TrieNode();
            }
            node = node.children[currentBit];
        }
    }
}

class TrieNode {

    TrieNode[] children;

    public TrieNode() {
        this.children = new TrieNode[2];
    }
}
