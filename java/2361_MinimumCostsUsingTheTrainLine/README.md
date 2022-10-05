## Method 1: Dynamic Programming

In this problem we can use a 2xn matrix to keep track of the minimum cost to travel to each station - dp[0][n] or dp[1][n] represents the minimum cost to travel to station n, ending at either regular line stop or express line stop.
To optimize our solution, we can use two arrays instead of a matrix. Also the result we want to get is an array of long, so it's better to convert everything to long at the beginning, using Java Stream.
Java stream with a collection (eg: List) list.stream()... </br>
Java stream with an array Arrays.stream(array)...</br>

Time Complexity: O(n)
