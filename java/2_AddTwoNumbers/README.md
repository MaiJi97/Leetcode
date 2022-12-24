## Method 1: Iterative - Pointers

Can be solved through simple math, iterate from left to right and add two numbers together with the carry over. </br>

Note: </br>
1) While condition can be l1 != null || l2 != null instead of adding two extra while loops, since the only difference inside the while loop is the change 
in values for l1 or l2. Can use conditional assignment to resolve it.

2) Do not need another two pointers to loop through l1 and l2, can increment l1 and l2 directly, since we do not need to keep track of the head for the 
two linked lists.

Time Complexity: O(max(m, n))
