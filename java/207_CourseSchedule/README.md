## Method 1: DFS / Traverse through recursion
We store each course and its prerequisites in a HashMap. Then for each course we visit each of its prerequisite recursively until we reach the base case which is determined by the visited array. </br>
int[] visited = int[numCourses] </br>
0 represents unvisited, 1 represents visited, and 2 represents done. </br>
Time Complexity: O(V+E)

## Method 2: BFS / Topological Sorting through Queue
For DAG (directed cyclic graph), for every directed edge uv, vertex u comes before v. </br>
      
Steps：</br>
1) 统计每个点的入度(in degree)
2) 将每个in degree为0的点放入queue作为起始节点
3) 不断从queue中拿出一个点，去掉这个点的所有连边
4) 一旦发现新的in degree为0的点，丢入queue中
</br>

We use topological sorting as an approach to detect cycle. If there is a cycle in the graph, we cannot complete all the courses.
      
Time Complexity: O(V+E)
