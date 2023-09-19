## Method 1: BFS through Queue

Minimum number of moves / shortest path - intuitively we should take BFS approach.

Though a normal BFS approach can result in a TLE error. There are two things to do:

1) Make sure we are not visiting nodes that we've seen before
   Use an hashset to track the cell we have already visited. Not able to use an array because the board is from -infinity to +infinity
   so we do not know total number of element to track. Also keeping a hashset of int[] will require override of the equals() method, to
   make it easier we can use String instead.
   
2) Reduce the search space
   There are four quadrants, while we only need to search in one of the quadrant as the searching can be symmetric. Therefore, when
   adding new cell to the queue, we add an condition to check if the cell is in the first quadrant. Also note that there might be the
   case that the target is reached from the other three quadrants, so we need to take one step (2 blocks) back.

Time Complexity: O(m * n)
   
