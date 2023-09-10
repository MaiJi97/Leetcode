## Method 1: Stack

We need to continuously check if the current asteroid will collide with the previous resulting asteroid being maintained which is why we need to use stack. If the current
asteroid and the peek resulting asteroid on the stack move toward each other, we can compare the size of the two asteroids and update the current asteroid to compare with
the next peek asteroid on the stack. We use a boolean flag because we need to know if we need to add the current asteroid to the stack in the end (if the two asteroids 
are moving toward each other and is not of the same size).

Time Complexity: O(n)
