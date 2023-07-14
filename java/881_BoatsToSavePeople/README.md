## Method 1: Greedy Algorithm + Two Pointers 相向双指针

Sort the array first, and then always pair the current largest weight with the current smallest weight and then update both pointers. 
If the sum exceed the limit, get rid of the smaller weight in the current round and only update the right pointer.

Time Complexity: O(n)
