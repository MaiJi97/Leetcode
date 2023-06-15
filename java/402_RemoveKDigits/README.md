## Method 1: Monotonic Stack

In this problem, we would want to replace previous elements with current element if current element is smaller. We can use the same 
monotonic approach here as we are dealing with problem of next greater element, next smaller element, previous greater element, previous 
smaller element, etc. 

当满足while的条件，remove peek element: keep executing the while loop as stack not empty + peek element is greater than the current element + number of removal we did is less than k. Pop the peek element out of the stack and push the current element onto the stack to remove the peek element.

Time Complexity: O(n)
