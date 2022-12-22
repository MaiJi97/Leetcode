## Method 1: Two Queues Brute Force

A stack should satisfy LIFO, while queue is FIFO / LILO. So each time we add an item onto the queue, we would want to add it to the bottom of the queue.
In order to do this we can first add the new element to queue 2, then remove and add all the existing elements from queue 1 to queue 2, finally remove and 
add all the elements from queue 2 back to queue 1 (queue 2 is in the same order as queue 1 so can be done through direct assignment). All other 
operations can be done in O(1) on queue 1. 

Note: Can also add to queue 1 directly when implementing push() method, but do the remove and add when implementing pop() method: remove and add all the 
elements from queue 1 to queue 2 until there is only one element left in queue 1, then remove the one last element from queue 1, finally remove and add all
the elements on queue 2 back to queue 1.

Time Complexity: O(n) for push, O(1) for all other

## Method 2: One Queue Brute Force

To improve the first method, we can use only one queue instead of two, because we remove and add from queue 2 to queue 1 through direct assignment. 
Here we can simply add the element first, then remove and add back each of the remaining element so the new element is added to the bottom of the queue.

Time Complexity: O(n) for push, O(1) for all other
