## Method 1: Stack

"[" "]" very often related to stack. The hard part of the problem is that the brackets are nested so that the current substring for repeating can be a part of another substring for repeating, which is why we need to use stack. Push character to the stack until we encounter a closing bracket, then we start to decode strings. Pop things out and track the substring until we encount a opening bracket. That is the end of the character string and we know if we continue to pop, it will be the digit characters which represent the number of times we want to repeat the previous substring. </br>

Note things to pay attention to: </br>
1) To pop characters out and construct the substring we need to insert each newly poped character to the beginning since stack is first in last out, and we can do this through a string builder.
2) After we repeat k number times the substring we will need to push them back to the stack because there can be outer "[]" so that the substring might be a part of the repeating again later.

Time Complexity:
<img width="596" alt="Screen Shot 2023-09-09 at 6 46 50 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/5df0b93f-49b7-4147-8c1d-40a484377eb7.png">

## Method 2: Two Stacks

In the previous approach, we use a single character stack to store both letters and digits. If there are many nested strings to be decoded, we will need to repeat popping out and pushing in the elements to the stack many times. Now instead, we can maintain two separate stacks.

<img width="594" alt="Screen Shot 2023-09-09 at 3 49 44 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/bfa131e3-a8e0-4d5f-bb63-6d6b7a083470.png">

Time Complexity: O(maxK * n)
