## Method 1: DFS / Divide and Conquer through recursion

We need the void helper function to modify the result list directly. Each path is concatenated from an empty string and is added to the result list when it's done. </br>
Call the method on its left tree and right tree respectively and merge the two. </br>
