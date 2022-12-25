## Method 1: Iterative - Pointers

This is similar to the problem 206. First we iterate up to the left node, then reverse the list until we reach the right node.

At the beginning:

<img width="857" alt="Screen Shot 2022-12-24 at 3 57 05 PM" src="https://user-images.githubusercontent.com/106039830/209451863-ca229ba7-27a4-4bee-8491-d3b422a44ff0.png">

When reach the left node: </br>
<img width="760" alt="Screen Shot 2022-12-24 at 4 00 01 PM" src="https://user-images.githubusercontent.com/106039830/209451888-df85294c-482c-42c9-9e5d-9b3421a75d4d.png">

Keep iterating until we reach the right node:

<img width="758" alt="Screen Shot 2022-12-24 at 4 01 15 PM" src="https://user-images.githubusercontent.com/106039830/209451903-55618920-e578-4658-9de9-82fba238c6aa.png">

We can decrement directly on left or right pointers because we do not need to track the original value. </br>
Also the second while loop breaks when current reaches the position after the right node, that's why the condition is right > 0 instead of right > 1 as in the first while loop. Then we just need to link the beforeStart node with the end node, and link the start node with the afterEnd node. There is a special 
case when the reverse starts from the first node, then no need to link beforeStart node with the end node but will need to set head to be the end node.

Time Complexity: O(n)
