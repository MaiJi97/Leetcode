## Method 1: Monotonic Stack

In this problem, we would want to replace previous elements with current element if current element is smaller. We can use the same 
monotonic approach here as we are dealing with problem of next greater element, next smaller element, previous greater element, previous 
smaller element, etc. 

当满足while的条件，用current element replace peek elmenet

Time Complexity: O(n)
