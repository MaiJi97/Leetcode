## Method 1: Reverse Linked List

We can utilize the reverse linked list method to solve the problem. Reverse the two linked lists and this problem is similar to problem 2 Add Two Numbers I.
The only difference is that we append the new node to the front of the current list instead of at the end. So the pointer we use to track the current position
will move one step backward instead of forward.

Time Complexity: O(m + n)

## Method 2: Stack

If we do not want to reverse the lists, we can also use stacks to store values in the list instead, since stacks allow us to access the last element first.

Time Complexity: O(m + n)

