## Method 1: Two Pointers 同向双指针

First sort the array of answers given by rabbits. Then we would like to group these answers. For example, if the array is [...2,2,2...] then there should be at least 3 rabbits, but if the array is [...2,2,2,2,2,2...] then there should be at least 6 rabbits. That is there should be (i - j) / (n + 1) group of (n + 1) rabbits. For whatever remained, we add another (n + 1)  to the ret.

Time Complexity: O(n)