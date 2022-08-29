## Method 1: Iterative - Pointers

<img width="958" alt="Screen Shot 2022-08-10 at 5 38 55 PM" src="https://user-images.githubusercontent.com/106039830/184025281-0672424b-8875-4229-b4a8-35334081c35c.png">

We create a dummy node in case the first node is a duplicate that we need to remove. Then we use two pointers current and prev to iterate through the list. We set current pointer to head, and prev pointer to the dummy node, and keep skipping while we are encountering duplicates. Using the prev pointer allows us to skip the current node if the current node is a duplicate we want to remove all such element from the list. </br>

Time Complexity: O(n)