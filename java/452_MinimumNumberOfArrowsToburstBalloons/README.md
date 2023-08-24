## Method 1: Two Pointers 同向双指针 - fast & slow

Interval problem - takes a greedy and two pointers approach. Sort by end time because we continuously update the slow pointer to point
at latest time we could shot the arrow (current interval's end time) so that it has the largest possibility to intersect with the next
interval. 

Time Complexity: O(n)
