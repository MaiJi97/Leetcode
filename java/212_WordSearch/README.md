## Method 1: DFS / Traverse through recursion + Trie / Prefix Tree

Similar as problem 79. The difference is that in problem 79, we iterate through each block on the board and match the word start from 
the block; though in this problem we also iterate through each block on the board but instead match a list of word (we can build a trie
for this) starting from the block, and add to the result if there is any single word matched in the trie.

Time Complexity: O(m * n * 3 ^ k) where k is the length of the longest word in the trie
