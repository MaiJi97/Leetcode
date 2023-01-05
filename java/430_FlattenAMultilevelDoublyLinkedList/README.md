## Method 1: Recursion

Use a pointer current to iterate through the linked list and we only need to recurse on part of the list. If while we traverse there is a node whose child is not null, we do a recursion on the child part to flatten the list. Then, handle the connection between the flattened part with current node and current.next node. Finally set the tail node to be current and what we return is the tail node. </br>

Time Complexity: O(n)

## Method 2: Iterative - Pointers and Stack

First in, last out. We use a stack to track the expected order of the flattened linked list and use two pointers (current & previous) to handle the linkage 
between nodes with correct order. First push the head node into the stack. While the stack is not empty, we pop one node from the stack which is the current node, and set all appropriate pointers of the current node with the previous. Then previous node is updated to be the current node, and current node will be updated when we pop the next node from the stack. </br>

Time Complexity: O(n)

## Method 3: Modify Method 2 - Without Use of Dummy Node

We can modify the previous solution and remove the use of dummy node. We do not really need the dummy node, if we add a check before each linkage to see if
we are at the beginning of the list. If we are at the beginning then just update the first pointer (which tracks the beginning of the list to be the first 
node poped out of the stack. This replace the dummy pointer) and then skip the first linkage. This add an additional check but eliminate the need to remove
the dummy pointer at the end. In a word, dummy node standardizes the situation but we do not need it if we add a special case checking.

Time Complexity: O(n)

