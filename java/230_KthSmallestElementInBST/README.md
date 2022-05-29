## Method 1: DFS / Inorder traverse using Arraylist
Use a helper function to traverse and store the elements in order in an array list. Since this is a BST is sorted so we are visiting and storing its elements in ascending order, we can get the value directly by using get(k-1) method. <br />
Time Complexity: O(n)

## Method 2: DFS / Inorder searching using Stack
This is also utilizing DFS to traverse inorder the elements in the BST, and we will return as soon as we pop out the kth element. <br />
Time Complexity: O(n)

