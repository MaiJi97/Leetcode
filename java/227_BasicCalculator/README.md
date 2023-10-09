## Method 1: Stack

Assume we have "3 + 2 * 2 - 4".

We keep track of a current number and current operator. Whenever we see a new operator, we process the result using the current number and current operator, push the result to the stack, and then update these two variables (看到新的operator时，处理上一个operator和number，并push进stack，因为乘除符号需要用到).  Meanwhile, since 乘除 have higher priority, we need to handle them differently. As we see a new operator, we will need to check the previous operator and if it is '*' or '/', we will need to compute using current operator, current number and previous number (peek element on the stack), then finally push the combined result to the stack. See comments in the code for a more detailed explanation.

名义上的current number和current operator，其实是上一位的number和operator。

Time Complexity: O(n)
