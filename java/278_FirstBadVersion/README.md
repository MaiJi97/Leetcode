## Method 1: Binary Search

We use the third binary search template in this problem. After we break out of the while loop, we reach (right, left), which one should we return?
Note that we are looking for the first bad version. According to the logic in the code, if mid is not a bad version (is a good version), that means
the first bad version is from mid+1 to the end => left. If mid is a bad version, the first bad version could be mid or any one from mid-1 to the beginning
=> right. We should return left in this case.

Time Complexity: O(logn)
