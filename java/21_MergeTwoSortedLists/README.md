## Method 1: Iterative - Pointers

In Add Two Numbers we can set the while condition to be when either of the two lists is not null, because even if one of them is null we can treat the value
to be added as 0 and all other steps in the while loop are the same. Though here the while condition is set to be when both lists are not null because we
will need to compare the two values. If one of them is null then simply append the rest of the other lists and return the result. In addition, we do not 
need to point next to new ListNode(x) here. Instead we can point next directly to l1 or l2.

Time Complexity: O(m + n)


## Method 2: Recursion

Base case is when either of the two lists is null. So rest is straightforward.

Time Complexity: O(m + n)
