## Method 1: Two Stacks

Since we want to get data both from the past and from the future, we need some data structure through which we can fetch data from both ends. One way is to use two 
stacks. One stack to store the past history, the other stack to store the future links.

Time Complexity: O(min(m, n)) where m is number of steps and n is the number of elements left in the stack.

## Method 2: Doubly Linked List

Anther option is to use a doubly linked list. We can get page in the past or in the future by calling the previous pointer or next pointer of the current list node.

Time Complexity: O(min(m, n))
