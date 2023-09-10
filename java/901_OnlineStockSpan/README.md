## Method 1: Monotonic Stack

Similar approach as problem 496. However, while popping elements out the stack in the next() method, instead of grabbing the element itself, we want to add the span of 
the popped element to the current result. So we can store both the element and its span as a pair on the stack. Keep executing the while loop as: the stack is not empty,
and the peek element is smaller than or equal to the current element. 

Time Complexity: O(n)
