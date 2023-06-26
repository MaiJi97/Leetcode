## Method 1: HashMap

If both vectors are sparse, we can possibly skip those zero digits can only compute at index where both vectors have non-zero digits. 
One way is to use a hash map to store all the non zero values in the form of <index, value> for each vector. In the dot product
computation method, we just need to iterate through the hashmap and look for value of the same index in the other vector.

Time Complexity: O(n)

## Method 2: Two Pointers 

As there could be collisions when the amount of data grow large, we could use some other ways. One way is to use pointers - parallel pointers.

Time Complexity: O(n)

## Method 3: Binary Search

Followup: what if only one vector is sparse?
A third way is to use binary search, as for each index in one vector we are trying to look for value at the same index in the other 
vector (if we are able to find the target index, the corresponding dot product component is non zero), and also the list are sorted
by index.

Time Complexity: O(nlogn)
