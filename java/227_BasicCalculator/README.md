## Method 1: Stack

Assume we have "3 + 2 * 2 - 4".

Since '*' and '/' have higher priority, we sometimes need to undo some operations to ensure the ordering as we go over the string iteratively (eg: 3 + is done 
after 2 * 2). Therefore, when we encounter a current operator, we will always have to look one step back to evaluate the previous operator with related numbers 
and determine if we need to redo the operation from current number, number before current number (peek element on the stack) and the previous operator. In this given example, as we see '-', current number is 2, number before current number (peek element on the stack) is also 2, and the previous operator is '*'. So we will compute 2 * 2 and then push this result to the stack. See comments in the code to see state of stacks after each step.

Time Complexity: O(n)
