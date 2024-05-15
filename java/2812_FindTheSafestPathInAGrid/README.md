## Method 1: BFS / Dijkstra

First create the helper method to track each cell's minimum distance to any thief through BFS. But instead of using boolean matrix to track cells we have been visited, we would want to use integer matrix to track shortest distance between a cell and any one of the thief.

Then use Dijkstra algorithm to find the maximum safety factor among safety factors of all the paths, which is the minimum distance between a cell in the path with any one of the thief.

Time Complexity: O(n ^ 2 * logn)
