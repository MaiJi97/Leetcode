## Method 1: DFS / Traverse through recursion - backtracking

We have a helper method that takes in parameters regarding the current state, including the expected side length, a current array 
that tracks how long each side has accumulated to, and an index up to which matchstick we have utilized. In the helper method, break
the recursion when we have used up all the matchsticks. Return true if each side in the current array has accumulated to the 
expected side length, or else return false. Else we find try to add the matchstick at current index to each of the four sides and 
call the method recursively on the rest of the matchsticks. After the recursive call, we need to take one step back and remove the 
length of the matchstick from the side to allow the pick up of other options.

Note that if we go sequentially through the matchsticks array, each matchstick can belong to any of the four sides, which is why we 
need to keep a current array that tracks how long each side has accumulated to. Also note that to avoid TLE, we would want to first 
sort the matchsticks array in descending order (not easy to sort directly since Collections.reverseOrder() is for array of object not
primitive). Instead we can set the index to start from the end of the matchsticks array.

Time Complexity: O(4 ^ n) where n is the number of matchsticks, since each matchsticks could belong to any of the four sides.
