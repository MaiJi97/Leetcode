## Method 1: Tree Map

In this problem, we still want to use hash map, but we want the entries to be placed in descending order of the key, which can be 
achieved through tree map.

If not using tree map, we can also use an array, having the keys stored in descending order in the array. After obtaining the 
appropriate key, we can get the corresponding roman by the key from an ordinary hash map, or simply from a static roman array which
is mapped from the key array.

Time Complexity: O(1)
