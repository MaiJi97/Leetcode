class Solution {
    public int[] maximizeXor(int[] nums, int[][] queries) {

        Arrays.sort(nums);
        ArrayList<ArrayList<Integer>> modifiedQueries = new ArrayList<>();

        for (int i = 0; i < queries.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(queries[i][0]);
            temp.add(queries[i][1]);
            temp.add(i);
            modifiedQueries.add(temp);
        }

        modifiedQueries.sort((a, b) -> a.get(1) - b.get(1));

        ArrayList<int[]> retTemp = new ArrayList<>();

        Trie trie = new Trie();
        int idx = 0;

        for (int i = 0; i < modifiedQueries.size(); i++) {
            int xi = modifiedQueries.get(i).get(0);
            int mi = modifiedQueries.get(i).get(1);
            int index = modifiedQueries.get(i).get(2);

            while (idx < nums.length && nums[idx] <= mi) {
                trie.insert(nums[idx]);
                idx++;
            }

            if (idx == 0) {
                retTemp.add(new int[]{index, -1});
            }

            else {
                int sum = 0;
                TrieNode node = trie.root;
                for (int j = 31; j >= 0; j--) {
                    int currentBit = (xi >> j) & 1;
                    int otherBit = currentBit == 0 ? 1 : 0;
                    if (node.children[otherBit] == null) {
                        node = node.children[currentBit];
                    }
                    else {
                        sum += (1 << j);
                        node = node.children[otherBit];
                    }
                }
                retTemp.add(new int[]{index, sum});
            }
        }
        retTemp.sort((a, b) -> a[0] - b[0]);
        int[] ret = new int[queries.length];
        for (int i = 0; i < retTemp.size(); i++) {
            ret[i] = retTemp.get(i)[1];
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
