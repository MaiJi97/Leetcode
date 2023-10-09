## Method 1: Stack

Assume we have "3 + 3 + (6 - 2)"

We keep track of a current number and current operator. Whenever we see a new operator, we process the result using the current number and current operator, and then
update these two variables (看到新的operator时，处理上一个operator和number). Meanwhile, as we see '(', be prepared to push the existing result and current operator to the 
stack, and then do the operation in the "()" as usual. As we see ')', we can also process the result inside "()" using the current number and current operator as 
usual, and then pop the exisiting result and operator we pushed into the stack earlier out of the stack to process the combined result. See comments in the code for a
more detailed explanation.

Time Complexity: O(n)
