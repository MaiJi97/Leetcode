## Method 1: Two Stacks Brute Force

A queue should satisfy FIFO / LILO, while stack is LIFO. So each time we push an item onto the stack, we would want to push it to the bottom of the stack.
In order to do this we can pop and push all the existing elements on stack 1 to stack 2, then push the new element onto stack 2, finally pop and push all
the elements on stack 2 back to stack 1. All other operations can be done in O(1) on stack 1. 

Note: Can also push to stack 1 directly when implementing push() method, but do the pop and push when implementing pop() method: pop and push all the 
elements from stack 1 to stack 2, then pop the top element from stack 2, finally pop and push all the elements on stack 2 back to stack 1.

Time Complexity: O(n) for push, O(1) for all other

## Method 2: Two Stacks Improved

First solution is not optimal because each time we want to push a new element we will need to pop and push all elements out of and onto stacks multiple 
times which takes O(n). We can achieve this in O(1) time and do the pop and push only once. Intuitively if we have all the elements from one stack pop 
and push to the other stack, we can get FIFO since the element at the bottom of stack 1 is now at the top of stack 2. So whenever we push we just push it 
to stack 1. Whenever we pop we would want to pop it from stack 2. If it is empty then pop and push the existing elements on stack 1 to stack 2. Same for 
peek() method. For empty we will need to check both stacks.

Time Complexity: O(1)
