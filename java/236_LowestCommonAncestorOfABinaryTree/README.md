## Method 1: DFS / Divide and Conquer through recursion

Similar to problem 235, but in this problem is tree is not a binary search tree, so we are not able to determine which part of the 
tree the LCA is at depending on the comparison between value of current node and the two given nodes.

Four cases: </br>
1) root is p or q
<img width="352" alt="Screen Shot 2022-06-12 at 3 17 16 PM" src="https://user-images.githubusercontent.com/106039830/173249667-b66fb839-e66b-49b3-9e6a-20ae2de6e355.png">
2) p and q are on different subtrees
<img width="358" alt="Screen Shot 2022-06-12 at 3 17 21 PM" src="https://user-images.githubusercontent.com/106039830/173249716-e23770ff-2e1b-4925-947d-660151f88973.png">
3) LCA is on left subtree </br>
4) LCA is on right subtree </br>

</br>

Time Complexity: O(n)
