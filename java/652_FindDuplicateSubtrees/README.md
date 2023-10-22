## Method 1: DFS / Divide and Conquer through recursion

String representation approach - One may represent a tree with a string. There exist different ways to do so. One of the possible 
representations of a tree is the following: (representation of the left subtree) root.val (representation of the right subtree). It is
a recursive representation because the parts in the brackets are representations of smaller subtrees.

<img width="469" alt="Screen Shot 2023-10-21 at 8 05 35 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/fc942cbb-704b-4f0c-88aa-e24cd55690df.png">

Equal trees will have equal string representation.

Time Complexity: O(n ^ 2) since finding the string representation for each subtree could take O(n) and there are n subtrees.
