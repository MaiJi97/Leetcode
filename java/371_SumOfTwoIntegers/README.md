## Method 1: Bit Manipulation 

<img width="489" alt="Screen Shot 2023-09-15 at 2 07 08 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/ae9ea2f2-3cc5-4b25-8fd3-9aee96aa9669.png">

We can split the addition of two numbers to two parts: the resulting digits after addition without considering any carry over, and the carrying part. Carry value
can be obtained through AND (&) operator, but will need to shift one bit to the left since carry will be added to the left bit of the current bit. Resulting 
digits after addition without carry can be obtained through XOR (^) operator. We can then add the carry value to it and update the carry value. Break the loop as
we complete adding the carry value.

Time Complexity: O(1)



