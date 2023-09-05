## Method 1: Stack

"[" "]" very often related to stack. The hard part of the problem is that the brackets are nested so that the current substring for repeating can be a part of another substring for repeating, which is why we need to use stack. Push character to the stack until we encounter a closing bracket, so we start to pop things out and track the substring until we encount a opening bracket. We know if we continue to pop, it will be the digit characters which represent the number of times we want to repeat the previous substring. </br>

Note things to pay attention to: </br>
1) To pop characters out and construct the substring we need to insert each newly poped character to the beginning since stack is first in last out, and we can do this through a string builder.
2) After we repeat k number times the substring we will need to push them back to the stack because there can be outer "[]" so that the substring might be a part of the repeating again later.

Time Complexity: O(n)
