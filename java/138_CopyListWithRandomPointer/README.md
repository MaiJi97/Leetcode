## Method 1: Hash Map

The key point in this problem is that we need a deep copy and the pointers are all pointing to the newly created nodes instead of nodes in the original list.
Though this is hard to achieve because the random pointers are not in order as the next pointers (for next we always point to the node right after the current
node). One way to solve the problem is to create a hash map data structure to store <Node, Node> - key is the node from the original list, value is the 
corresponding node from the copied list. What we need to do is to add pointers for the value nodes in the hash map, according to the key nodes in the 
hash map. This method takes O(n) space though.

Time Complexity: O(n)

## Method 2: Attach new nodes to the original list

Another method takes O(1) space. We will modify the original list and follow the three steps: 1) add a new node after each node from the original list. 2)
add random pointers since we know the random pointers will point to the node right after the node pointed by the random pointer of the original node. 3)
seperate the original list and the copied list.

<img width="652" alt="Screen Shot 2023-01-04 at 6 23 48 PM" src="https://user-images.githubusercontent.com/106039830/210697860-e1369229-8ed9-4072-8872-f0d15604f8e8.png">


Time Complexity: O(n)
