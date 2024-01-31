## Method 1: Recursion

Use a pointer current to iterate through the linked list and we only need to recurse on part of the list. If while we traverse there is a node whose child is not null, we do a recursion on the child part to flatten the list. Then, handle the connection between the flattened part with current node and current.next node. Finally set the tail node to be current and what we return is the tail node. </br>

Time Complexity: O(n)

## Method 2: Iterative - Pointers and Stack

参考binary tree preorder traversal using stack. 

Two ways:
1) One way is to create a dummy node so we can generalize the implementation within the while loop. Use the dummy node as prev pointer.
2) No dummy node. Instead, we can split into cases (when current is the first node & when current is a later node).

We can use either way, which are method 2 and method 3.

We use a stack to track the expected order of the flattened linked list and use two pointers (current & previous) to handle the linkage between nodes with correct order. This is similar to binary tree preorder traversal using stack - first push the head node into the stack. While the stack is not empty, we pop one node from the stack which is the current node, set all appropriate pointers of the current node with the previous, and update previous node to be current node. Finally add next node and child not of the current node to the stack (remember to set child node to null after adding). Current node will be updated when we pop the next node from the stack. </br>

Time Complexity: O(n)

## Method 3: Modify Method 2 - Without Use of Dummy Node

We can modify the previous solution and remove the use of dummy node. We do not really need the dummy node, if we add a check before each linkage to see if
we are at the beginning of the list. If we are at the beginning then just update the first pointer (which tracks the beginning of the list to be the first 
node poped out of the stack. This replace the dummy pointer) and then skip the first linkage. This add an additional check but eliminate the need to remove
the dummy pointer at the end. In a word, dummy node standardizes the situation but we do not need it if we add a special case checking.

Time Complexity: O(n)

