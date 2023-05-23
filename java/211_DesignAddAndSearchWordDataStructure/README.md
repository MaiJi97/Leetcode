## Method 1: Trie / Prefix Tree 

Similar as Problem 208, but can use wildcard matching here. In this case, we need a helper method that takes in the current node and the
index of the current character in the word. If there is a dot (wildcard), we will need to iterate through the 26 characters from a to z 
and use DFS to find a matching. 
