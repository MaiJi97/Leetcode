## Method 1: Monotonic Stack
 
Similar approach as problem 496. However, instead of grabbing the value itself, we want the difference between the index of the value 
and the index of the next greater element. So we can either store both the value and its index as a pair on the stack (as in the code), or we can store only the index and refer to the value as temperatures[i] when comparing values. Keep executing the while loop as: the stack is not empty, and the peek element is smaller than or equal to the current element.

Time Complexity: O(n)
