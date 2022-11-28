## Method 1: BFS with sorting

We can use BFS to traverse through the tree which will be in the order from the top level to the bottom level. Since we would want to return the value in 
vertical order, we will also need to track the column number of each node using a hash map. Because of the same reason, we will also need to push the 
column number together with the node itself into the queue as we traverse. We can define a custom class to do this. </br>

After we complete filling in the hash map, we can sort the key set of the hash map, iterate through each column from left to right and add the values 
in corresponding order. </br>
 
Queue<Pair> where Pair consists of the node as well as its column number. </br>
HashMap<Integer, List<Integer>> where key is the column number and value is the list of node values from this column.

Time Complexity: O(nlogn)

## Method 2: BFS without sorting

The only difference between method 2 and method 1 is that we get rid of the sorting which takes nlogn time. Instead we use a min pointer and a max pointer 
to track the range of the column number and use one for loop to traverse through each column from left to right.
  
Time Complexity: O(n)
  

## Method 3: DFS through recursion

If using DFS, there is no guarantee that the traverse order will be from top to bottom. So in the hash map we also need to track the row number of a node. </br>
  
After we complete filling in the hash map, we can iterate through the hash map in the order of its column number / key value, then sort the value of 
each value by its row number and add the column number to the result. </br>
  
HashMap<Integer, List<int[]>> where key is the column number and value is the list of node values as well as the row number of a node from this column. Then

Time Complexity: O(W * H log H)
  
  
