## Method 1: Hash Map 

Similar to two sum problem. HashMap to store <remainder, frequencies> as a key value pair. Iterate through each element, calculate the remainder and look for the other remainder that sums up to 60 with the current remainder. Add frequencies to the final result. 

Note that if the current remainder is 0, the other remainder should also be 0 instead of (60 - remainder).

Time Complexity: O(n)
