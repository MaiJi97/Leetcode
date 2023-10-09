## Method 1: Hash Map + Double Linked List

![LRU-Cache-650x296](https://user-images.githubusercontent.com/106039830/206595813-8ec61583-053f-4d25-bafa-ec0e64821a8f.png)

Why use Hash Map? </br>
To maintain the key value structure and accomplish put and get in O(1) time complexity.

Why use Linked List?
Since the capacity of the hashmap is limited, we will need a way to track the least recent visited key. We can do it through a queue,
so that most recently visited elements are added to the tail and least recently visited elements are removed from the front. But the
operation takes O(n). Linked List is most suitable for insertion / deletion of element from arbitrary position.

Why use Double Linked List instead of Single Linked List? </br>
By using Double Linked List we can get access to the node before a specific node. There are certain circumstances we need to access a previous node, for example, when we remove a node in the middle of list, or when we want to get access to the node before the tail dummy node and remove it when we reach the maximum capacity. If use Single Linked List, we will have to traverse from the beginning of the list, since we only have a next pointer.

Why we store both key and value as a part of the node structure instead of just value? </br>
To make it easier when remove the entry from the Hash Map.

Why we need dummy node head and tail? </br>
To avoid issues that at the beginning the cache is empty; To make it simpler if the node we want to remove is the first node; To accurately locate the last node.
