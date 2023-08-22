## Method 1: BFS / Topological Sorting through Queue

As we are looking for the root that generates the shortest path, we can rephrase the problem as finding out the nodes that are overall
close to all other nodes, especially the leaf nodes. 

<img width="621" alt="Screen Shot 2023-08-21 at 3 09 17 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/86109a1c-cdde-450d-a311-e176fd445463.png">

The idea is to trim out the leaf nodes layer by layer, until we reach the core of the graph, which are the centroids nodes. We start 
from the leaf nodes (in degree == 1) and once we trim out the first layer of the leaf nodes, some of the non-leaf nodes would become 
leaf nodes. Then we continue to trim out leaf nodes (in degree == 1). 

How do we know to use topological sorting?
This above process resembles the topological sorting algorithm which generates the order of objects based on their dependencies. Just
like in the Course Schedule I problem, the courses that have the least dependency (in degree == 0) would appear first in order; In this 
problem, the nodes that are leaves (in degree == 1) would appear first in order.

Time Complexity: O(V) where V is the number of nodes
