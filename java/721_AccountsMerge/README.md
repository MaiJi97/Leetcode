## Method 1: DFS / Backtracking

- Build Graph
  Build a graph: each node represent an email, and there is an edge between two nodes if the two emails belong to the same person. In terms of the data structure, the graph is represented by HashMap<node, Set>, a node's neighbors are stored in the Set. </br>
  We use another HashMap to store all the emails and the person each email belongs to
  
- DFS
  We use a HashSet to track the nodes / emails we have visited. The DFS function does not return anything, so we do not need to write the base case. The recursion breaks when all the nodes are visited. </br>
  
Time Complexity: O(a1+a2+a3+...+an)
