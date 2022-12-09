## Method 1: BFS / Level Order Traverse through Queue

Steps:
1) Offer the root node to the queue.
2) Poll the nodes from the queue in FIFO order. As we traverse the whole level, count the size n in the queue and poll n times.
3) For each node polled from the queue, check its left node and right node, and offer them to the queue if they exist.

Time Complexity: O(n) - number of nodes

