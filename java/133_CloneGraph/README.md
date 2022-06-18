## Method 1: BFS / Level Order Traverse through Queue

Steps:
1) Find all the points
2) Copy all the points
3) Copy all the edges

Queue的实现：Linked List / Array / ArrayDeque </br>
While queue is not empty, pop the element in the queue and add all its neighbors into the queue in order, if the neighbor is not visited yet.

Time Complexity: O(V+E) - number of nodes and edges

