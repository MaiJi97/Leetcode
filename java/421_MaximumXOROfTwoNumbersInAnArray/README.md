## Method 1: Trie / Prefix Tree + Bit Operation

We can use a brute force method that we compute the XOR value (^) for each pair of numbers in the array, and get the maximum. This can take O(n^2), To make it more efficient, we can construct a trie and insert the binary representation of all the numbers into the trie. Then for each number, we traverse along the trie to find the longest match of binary representation prefix. Note that each trie node has two children instead of 26 characters we and to match prefix of binary representation of a number instead of prefix of a word. 

<img width="772" alt="Screen Shot 2023-05-25 at 3 20 16 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/287b75aa-d157-4e2c-a68f-389ced6e9eef.png">

Also note that for bit operation, we get the ith bit of the binary representation of a number through (num >> i) & 1 where i is from 31 
to 0. For each number, we find the other number that gives the maximum XOR with it by traversing through the trie => if current bit is 
x and there is no (1-x) in the trie, traverse through the current number's path; else add 1 << i to the sum and traverse through the other number's path.

<img width="288" alt="Screen Shot 2023-05-26 at 4 30 13 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/19606c01-3b83-41f1-90ff-bc13a84cd955.png">


Time Complexity: O(n)

