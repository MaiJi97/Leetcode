## Method 1: Iterative - Pointers

<img width="731" alt="Screen Shot 2022-08-12 at 7 07 41 PM" src="https://user-images.githubusercontent.com/106039830/184455862-67b77618-d89d-4330-b0af-ec75a4ea1999.png">

We use the same fast & slow pointers approach here as in problem 141. The two pointers will meet at some point within the cycle (not guarantee to be the start point of the cycle). When they meet, the distance that the fast pointer goes through is m + kn + y, and the distance that the slow pointer goes through is m + y. Since the fast pointer is twice as fast as the slow pointer, we have the equation m + kn + y = 2(m + y). </br>

Note: The slow pointer must not yet complete one cycle as the pointers meet, because as it enters the cycle, the fast pointer is already in the cycle and their distance apart should be less than n which is the total length of the cycle. So there is no way the slow pointer has already gone through n but the fast pointer has still not catched up. </br>

Then, if we simplify the equation, we get m = x + n(k-1). So we just need to set two pointers to move at the same speed. When one of the them move distance m, the other will move distance x + n(k-1). So we know the place where these two pointers meet will be the start of the cycle.

Time Complexity: O(n)
