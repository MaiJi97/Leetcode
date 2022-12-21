## Method 1: Two Stack

We hope to track the minimum element in the stack. This cannot be done through a variable because if the element we pop out from the stack is the minimum
element, we would want to take one step back to the previous one minimum value in the stack. First solution is to use two stacks, one main stack is for 
the push and pop of elements, the other minStack is to continuously track the minimum element by pushing it onto the stack. If we pop an element from the 
main stack and the element is the current minimum element, we will also pop it from the second stack. Why push to minStack when < and = ? Because for 
example if we have 7, 6, 6 on the main stack and only 7, 6 on the minStack, by the time we pop 6 from the main stack, there is another 6 so the minimum 
value is still 6. But when 6 is pop out of the minStack, the minimum value becomes 7 which is incorrect.

Time Complexity: O(1)

## Method 2: Two Stack Improved

In the previous solution the case we push a new minimum value on to minStack is when < and =. What if there is a continuous list of same value? Then we 
will need to push the same value to the minStack repeatedly. One way to improve it by pushing a key value pair (minVal, number of occurrences) to the
minStack instead.

Time Complexity: O(1)

## Method 3: One Stack

Is it possible to use only one stack? We can use one stack and store both the value and current minimum value as key value pair in the stack. 

Time Complexity: O(1)
