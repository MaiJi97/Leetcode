## Method 1: Iterative - Pointers

Can be solved through simple math, iterate from left to right and add two numbers together with the carry over. </br>

Note: </br>
1) While condition can be l1 != null || l2 != null instead of l1 != null && l2 != nulladding two extra while loops to check l1 and l2, since the only 
difference inside the while loop is the change in values for l1 or l2. We can use conditional assignment to resolve it. The value is 0 if the list is null,
and all other steps in the while loop are the same.

2) Do not need another two pointers to loop through l1 and l2, can increment l1 and l2 directly, since we do not need to keep track of the head for the 
two linked lists.

Time Complexity: O(max(m, n))
