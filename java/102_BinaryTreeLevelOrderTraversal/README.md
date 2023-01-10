## Method 1: BFS / Level Order Traverse through Queue

Steps:
1) Offer the root node to the queue.
2) Poll the nodes from the queue in FIFO order. As we traverse the whole level, count the size n in the queue and poll n times.
3) For each node polled from the queue, check its left node and right node, and offer them to the queue if they exist.

Time Complexity: O(n) - number of nodes

## Method 2: DFS / Level Order Traverse through recursion

Another method is through DFS, but we need to take in an extra piece of information which is the current height. If we are at the level that we already has
the list that includes all the nodes on that list, height >= list.size(), then add the root value to it and continue traversing its left and right child. Else add an empty list to the result and do the same.

Time Complexity: O(n) 
