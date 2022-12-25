## Method 1: Iterative - Pointers

This is similar to the problem 206. First we iterate up to the left node, then reverse the list until we reach the right node.

At the beginning:

<img width="857" alt="Screen Shot 2022-12-24 at 3 57 05 PM" src="https://user-images.githubusercontent.com/106039830/209451863-ca229ba7-27a4-4bee-8491-d3b422a44ff0.png">

When reach the left node: </br>
<img width="760" alt="Screen Shot 2022-12-24 at 4 00 01 PM" src="https://user-images.githubusercontent.com/106039830/209451888-df85294c-482c-42c9-9e5d-9b3421a75d4d.png">

Keep iterating until we reach the right node:

<img width="752" alt="Screen Shot 2022-12-25 at 2 51 17 PM" src="https://user-images.githubusercontent.com/106039830/209481655-06fcfba2-026b-40ab-bd0c-442f30116299.png">

Relink the pointers:

<img width="757" alt="Screen Shot 2022-12-25 at 2 48 18 PM" src="https://user-images.githubusercontent.com/106039830/209481620-e1f9033a-d353-4161-8e53-8bd1f3f6aab3.png">

Note: We can decrement directly on left or right pointers because we do not need to track the original value and will not use them later. </br>
Also the second while loop breaks when current reaches the position after the right node, that's why the condition is right > 0 instead of right > 1 as in the first while loop. Then we just need to link the beforeStart node with the end node, and link the start node with the afterEnd node. There is a special 
case when the reverse starts from the first node, then no need to link beforeStart node with the end node but will need to set head to be the end node.

If we modify the problem to be reverse the first k nodes, we do not need to link the beforeStart node with the end node, but instead can return the end 
node as the result. As for linking the start node with the afterEnd node, we can just refer to head node as the start node.

Time Complexity: O(n)
