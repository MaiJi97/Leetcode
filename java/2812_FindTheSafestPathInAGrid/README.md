## Method 1: BFS / Dijkstra

First create the helper method to track each cell's minimum distance to any thief through BFS. Theoratically we have to use a boolean matrix to track cells we have visited, but since we already have another matrix to recrod the shortest distance between a cell and any one of the thief, we can save some work and use the shortest distance matrix instead for same purpose as the visited matrix.

Then use Dijkstra algorithm to find the maximum safety factor among safety factors of all the paths, which is the minimum distance between a cell in the path with any one of the thief.

Time Complexity: O(n ^ 2 * logn)
