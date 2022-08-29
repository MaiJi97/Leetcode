## Method 1: Iterative - Pointers

<img width="769" alt="Screen Shot 2022-08-15 at 8 30 53 PM" src="https://user-images.githubusercontent.com/106039830/184994369-13540b77-0910-49ed-9d9c-a4e25ba1f379.png">

First we iterate through the list and count how many nodes are there, and then divide the count by k to get the average number of elements there are in each division. If there is a remainder, we know some division will have one more element in it. Tricky part is to know when we reach the end of the each division so that we can cut it off and set the last element pointing to null, which could be achived by pointers approach.
Time Complexity: O(n)
