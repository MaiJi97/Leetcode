## Method 1: Dynamic Programming 

Similar to problem 198, but the difference is that the first house and the last house are adjacent to each other, so if the thief has 
robbed the first house, they cannot steal the last house and vice versa. Therefore, we further splitted into two cases: if the thief 
has robbed house at index 0 then look for maximum value from dp[n-2]; if the thief has robbed house at index 1 then look for maximum 
value from dp[n-1].

<img width="636" alt="Screen Shot 2023-07-24 at 12 49 10 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/b8e447c0-85d1-4f25-8888-abe8b0c6c90e.png">

Time Complexity: O(n)

