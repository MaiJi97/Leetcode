## Method 1: Dynamic Programming

Bottom up solution, dp[i][j] represents the MRS of the subarray of nums1 of first i char, and subarray of nums2 of first j char. </br>

Recurrence relation:

dp[i][j] = i or j if i == 0 or j == 0 </br>
dp[i][j] = dp[i-1][j-1] + 1 if nums1[i-1] == nums2[j-1] </br>
Note: i and j represents the first i or j characters, so the index has to be -1 </br>

Time Complexity: O(mn)
