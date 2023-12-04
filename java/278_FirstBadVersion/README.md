## Method 1 & 2: Binary Search

We can use template 2 or template 3 of binary search in this problem. For template 2, after we break out of the while loop, we reach left == right, so we can return any of them. For template 3, after we break out of the while loop, we are like (right, left), where left should be the target.

Better to use template 2 though, as we do not have a specific target to look for.

Time Complexity: O(logn)
