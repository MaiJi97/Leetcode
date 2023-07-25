## Method 1: Bucket Sort

![radix-sort-algorithm2](https://github.com/MaiJi97/Leetcode/assets/106039830/4e008347-b909-4f56-8312-409b1a84e9b9.png)

主要用到Bucket Sort, 重点在于character和frequency之间的mapping (sort frequencies). First use hashmap to store each character and its frequency, and then we need to sort the entries in hashmap by frequencies. A way to implement this is to use bucket sort through an array - character of frequency i stored at index i.

Time Complexity: O(n)
