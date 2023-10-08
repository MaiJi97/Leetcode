## Method 1: BFS / Traverse through Queue

First construct graph using the given equations (note the graph is undirected so edges represent relationships on both ways). Then we can loop through the queries and
for each query, apply BFS starting from the divident, traverse until we reach the divisor. We will need to store the intermediate result before traversing the next
level, which is why we need to use Pair data structure to store both the current dividend the intermediate result in the queue.

Time Complexity: O(m * n) where m is the number of equations and n is the number of queries
