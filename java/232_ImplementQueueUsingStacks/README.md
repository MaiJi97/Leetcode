## Method 1: Two Stacks Brute Force

A queue should satisfy FIFO / LILO, while stack is LIFO. We can handle this either when pushing element or popping element. 

If we do this when pushing the element: 后加的放下面。

So each time we push an item onto the stack, we would want to push it to the bottom of the stack. In order to do this we can pop and push all the existing elements on stack 1 to stack 2, then push the new element onto stack 2, finally pop and push all the elements on stack 2 back to stack 1. All other operations can be done in O(1) on stack 1. 

Time Complexity: O(n) for push, O(1) for all other

## Method 2: Two Stacks Improved

If we do this when popping the element: 从下面拿。

Following the idea in method 1, when popping an element, we can pop and push all the existing elements on stack 1 to stack 2, pop an element from stack 2 and pop and push all the elements on stack 2 back to stack 1.

Though we can optimize this as we do not need to repeatedly transfer the elements between stack 1 and stack 2, and elements can stay on stack 2 once they are popped and pushed from stack 1 to stack 2. So whenever we push we just push it to stack 1. Whenever we pop we would want to pop it from stack 2. If it is empty then pop and push the existing elements on stack 1 to stack 2. Same for peek() method. For empty we will need to check both stacks.

Time Complexity: O(1)
