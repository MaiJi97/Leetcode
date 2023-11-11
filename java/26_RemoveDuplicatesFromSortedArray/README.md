## Method 1: Two Pointers 同向双指针 - fast & slow

One pointer i to iterate through the array, the other pointer j to keep track of the last unique element in the array. If the current element pointed by i is different from the last unique element pointed by j, we increment j by 1 and assign the value at i to the position at j.

Time Complexity: O(n)
