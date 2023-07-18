## Method 1: Two Pointers 同向双指针 - fast & slow

One pointer i to iterate through the string, the other pointer j to track the position of the next unique element in the array. If the next element is not a duplicate, we assign the value that i is pointing at to the position that j is pointing at, and increment j by 1.

Time Complexity: O(n)
