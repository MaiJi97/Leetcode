## Method 1: BFS / Level Order Traverse through Queue

Same as in problem 102. The only difference is that we have to track the current level to decide if we traverse from left to right or the opposite on the
current level. To traverse in the opposite direction, we can add the current node value to index 0. Or another way is to reverse the list of nodes on the
current level in the end through Collections.reverse(list)

Time Complexity: O(n)
