## Method 1: Trie / Prefix Tree + Bit Operation

In this problem, we use trie to match prefix of binary representation of a number instead of prefix of a word, therefore each trie node
has two children instead of 26 characters. 

<img width="772" alt="Screen Shot 2023-05-25 at 3 20 16 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/287b75aa-d157-4e2c-a68f-389ced6e9eef.png">

Also note that for bit operation, we get the ith bit of the binary representation of a number through (num >> i) & 1 where i is from 31 
to 0. For each number, we find the other number that gives the maximum XOR with it by traversing through the trie => if current bit is 
x and there is no (1-x) in the trie, traverse through the current number's path; else traverse through the other number's path.

Time Complexity: O(n)
