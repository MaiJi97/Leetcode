## Method 1: Stack

This problem satisfies the LIFO principle, so we may use a stack. For each left parentheses appeared, we would want to make sure there is a matching right
parentheses appearing in the correct order, so we can push a corresponding right parentheses to the stack, pop it whenever we see a right parenthese in the
string and see if they match. In the end the stack should be empty if all the parentheses are valid.

Time Complexity: O(n)
