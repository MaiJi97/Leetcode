## Method 1: Two Pointers 相向双指针

One pointer starts from the beginning of the array, the other starts from the end of the array. The one corresponding to larger value in the array will move one step forward. Then we use a counter to keep track of the maximum amount of water we could obtains through the two boundaries.

Time Complexity: 0(n)