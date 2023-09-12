## Method 1: Priority Queue

One way is to add each pair of elements into the priority queue, and poll the k pairs with the smallest sum out of the queue.

Time Complexity: O(m * n * logmn)

## Method 2: Priority Queue Improved

Note that we do not necessarily need to add all the pairs into the queue using the nested for loop. Instead we can use two parallel pointers, starting from the first
index of both arrays, and add pairs to the queue selectively,

Time Complexity: O(min(m * n * logmn, klogk)
