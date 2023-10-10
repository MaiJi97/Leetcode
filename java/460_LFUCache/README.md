## Method 1: Two Hash Map + Linked Hash Set

One hash map as the data structure for cache, the other for the mapping between keys and their frequencies. For each frequency in the 
second hash map, we could possibly use a queue to store keys and add / remove when needed, but this can take O(n). To ahieve O(1) time
complexity, we can make use of the Linked Hash Set.

Time Complexity: O(1)
