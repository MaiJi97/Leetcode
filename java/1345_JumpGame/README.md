## Method 1: BFS / Traverse through Queue

Similar to problem 1306, difference is that apart from jumping to indices specific steps from the current index, we can also jump to index
that has the same value as the current index. So we need to use a hashmap to store each value and all the indices it appears at. Then in
the body just add an additional case when adding neighbors to the queue. What are the neighbors? They are the indices right before and 
after the current index, as well as all the indices which have the same value as the current index.

Note that we need to get the size of the current state of the queue, as we increment number of jumps only once every time we poll all the 
elements in the queue.

Time Complexity: O(n)
