## Method 1: Trie / Prefix Tree + Bit Operation 

Similar as problem 421. Difference is that in this problem, we need to compute the maximum XOR value for each query separately. An intuition
is to construct a trie for each query, which can make the running time very large (n^2). Therefore, we can sort the nums array and sort the
queries by its mi and construct a single trie while we traverse through the queries from smallest mi to largest mi. However, this may mess
up the original order of the queries, and that is why we need also to store the index of the query in addition to xi and mi.

Time Complexity: O(Queries x n)
