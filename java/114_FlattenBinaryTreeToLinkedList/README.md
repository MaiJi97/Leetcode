## Method 1: Divide and Conquer through recursion 
DFS preorder traverse, and link the node all the way to the right. </br>
We call the method itself on both its left subtree and right subtree, and link the subtrees as root -> flattened left tree -> flattened right tree. </br>

<img width="211" alt="Screen Shot 2022-06-12 at 5 18 58 PM" src="https://user-images.githubusercontent.com/106039830/173254027-9a45ac20-7fda-4707-bb46-0132f7d23b24.png">

