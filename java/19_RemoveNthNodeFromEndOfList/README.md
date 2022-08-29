## Method 1: Iterative - Pointers 

We can use the fast and slow pointers approach in this problem. Since we aim to remove the nth last element from the list, we can let the fast pointer go n steps first and then let both fast and slow pointers go at the same pace. In this way, as the fast pointer reach the end of the list, the slow pointer will reach the nth last element. Using a dummy node in this case allows the slow pointer stop one node before the target, and set its pointer to the one after the target. </br>

Time Complexity: O(n);
