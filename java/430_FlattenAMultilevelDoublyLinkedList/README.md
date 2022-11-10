## Method 1: Traverse through DFS / Recursion

Use a pointer current to iterate through the linked list and we only need to recurse on part of the list. If while we traverse there is a node whose child is not null, 
we do a recursion on the child part to flatten the list. Then, handle the connection between the flattened part with current node and current.next node. Finally set
the tail node to be current and what we return is the tail node. </br>
Time Complexity: O(n)

## Method 2: Iterative Approach - Stack

First in, last out. We use a stack to track the expected order of the flattened linked list and use two pointers (current & previous) to handle the linkage 
between nodes with correct order. First push the head node into the stack. While the stack is not empty, we pop one node from the stack which is the current 
node, and set all appropriate pointers of the current node with the previous. Then previous node is updated to be the current node, and current node will be
updated when we pop the next node from the stack. </br>
Time Complexity: O(n)
