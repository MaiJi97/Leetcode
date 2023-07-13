## Method 1: Four Pointers

Set four pointers respectively at top, bottom, left and right. In each while loop, we complete a full cycle of traverse, and update
the four pointers. 向内update

Note that we check the conditions for the while loop after each full cycle, whereas we may terminate early after the first two for loops, 
so we need to recheck the conditions within the while loop.

Time Complexity: O(m * n)
