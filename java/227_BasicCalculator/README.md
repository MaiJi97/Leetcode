## Method 1: Stack

Assume we have "3 + 2 * 2 - 4".

Since '*' and '/' have higher priority, we sometimes need to undo some operations to ensure the ordering as we go over the string iteratively (eg: 3 + 2 is done 
after 2 * 2). Therefore, when we encounter a current operator, we will always have to look one step back to evaluate the previous operator with related numbers 
and determine if we need to redo the operation from previous number, number before previous number (peek element on the stack) and the previous operator. See 
comments in the code to see state of stacks after each step.

Time Complexity: O(n)
