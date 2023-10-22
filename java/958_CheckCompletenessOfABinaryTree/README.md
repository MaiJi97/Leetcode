## Method 1: BFS / Traverse through Queue

The intuition is that for a complete binary tree, a null node could only appear at last. That means, after we encounter null node, 
there could not be any node that is not null. Therefore, we can use two boolean variables to track this condition. As soon as we 
see a null node, we set the variable hasEncounteredNull to true, then if we encounter another node that is not null while 
hasEncounteredNull is true, we know the result is false.

Time Complexity: O(n)

## Method 1: BFS / Traverse through Queue - Improved

Same logic as method 1, but implify the method by keeping only one boolean variable and allowing the queue to have null node.

Note that to allow queue to contain null value, we have to use LinkedList instead of ArrayDeque.

Time Complexity: O(n)

