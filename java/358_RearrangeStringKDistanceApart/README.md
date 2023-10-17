## Method 1: Priority Queue + Greedy Algorithm

Similar to problem 767 Reorganize String. Difference is that in problem 767, k is fixed which is 2. Here k can be any value. So we need an additional hash map to keep track of the latest index at which each character appears. While the peek pair in the priority queue does not satisfy the distance constraint, we will keep polling pairs out of the queue until the peek satisfies the constraint and will be next character to append. Note that we need a list to store those pairs being polled out as they will be reinserted into the queue. Also at the end we need to add a special case for k = 0 and k = 1 (no restriction on arrangement). The rest are all the same.

Time Complexity: O((n + k) log k) where n is the length of the string and k is the number of unique characters in the string
