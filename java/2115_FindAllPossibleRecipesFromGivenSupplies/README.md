## Method 1: BFS / Topological Sorting through Queue

Similar as problem 207 course schedule. Use topological sort as there is a dependency relationship between different ingredients (nodes). Note a difference is that in
problem 207 we already know total number of courses and have each course (node) represented by a number of 0-index scale, so that we can pre-construct the graph and 
inDegree array. But in this problem we get to know the node only while we traverse the nested list. 

Time Complexity: O(V+E)
