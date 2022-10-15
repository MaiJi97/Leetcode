## Method 1: Two Pointers 同向双指针

Sliding window - One pointer i to loop through the string, the other pointer j track the position of the next unique value in the array. If the next element is not a duplicate, we assign the value that i is pointing at to the position that j is pointing at, and increment j by 1.

Time Complexity: O(n)
