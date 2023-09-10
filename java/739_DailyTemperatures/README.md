## Method 1: Monotonic Stack
 
Similar approach as problem 496. However, instead of grabbing the value itself, we want the difference between the index of the value and the index of the next greater element. So we can store both the value and its index as a pair on the stack. Keep executing the while loop as: the stack is not empty, and the peek element is smaller than or equal to the current element.

Time Complexity: O(n)
