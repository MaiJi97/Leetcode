## Method 1: Dynamic Programming

Intuition here is that, if we pick a root R to be the root of the tree, the total number of structurally unique trees would be the 
total number of subtrees formed from its left elements times the total number of subtrees formed from its right elements. This could
be solved through a bottom up dynamic programming approach. We could compute total number of structurally unique trees with i nodes
where i is 0 to n (for convenience) and each time the answer is got through assigning each node from 0 to i as root node.

dp[i] represents number of structurally unique tree with i nodes.

Recurrence relation: </br>
dp[i] = dp[j] + dp[i - 1 - j] where i is from 0 to n and j is from 0 to i - 1

Time Complexity: O(n ^ 2)
