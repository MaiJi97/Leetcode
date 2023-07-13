## Method 1: Two Pointers 

Intuition is that we want to find the breakpoint where the substring after it is monotonically decreasing. Then we find the next greater
element in the substring and swap it with the breakpoint. Finally sort the substring after the breakpoint in ascending order. 

<img width="687" alt="Screen Shot 2023-07-13 at 4 36 14 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/d57f939b-e75e-4c30-bb00-269b9f62b536.png">

Time Complexity: O(n)
