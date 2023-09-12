## Method 1: Stack

Reorganize the data so that each car's position and speed are stored in pairs. Sort the pair by the position. Then, we iterate the pairs from the end and compare the time needed for the current car to reach the destination with the peek car on the stack. If the current car needs less time, that means it is in the same fleet with the
peek car. Else, add it to the stack.

Time Complexity: O(n)
