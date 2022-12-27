## Method 1: Iterative - Pointers

Use two pointers, a fast pointer and a slow pointer. The fast pointer goes twice as fast as the slow pointer (or at least faster than it). If there is a cycle the two pointers will eventually meet.

Time Complexity: O(n)
