## Method 1: Bucket Sort

主要用到Bucket Sort, 重点在于character和frequency之间的mapping。First use hashmap to store each character and its frequency，and then we 
need to sort the entries in hashmap by frequencies. A way to implement this is to use bucket sort through an array - character of
frequency i stored at index i.

Time Complexity: O(n)
