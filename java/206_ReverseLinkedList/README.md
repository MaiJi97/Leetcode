## Method 1: Recursion

Since we requires both head and head.next not to be null, so base case should be return when either of them is null.

<img width="904" alt="Screen Shot 2022-12-24 at 1 30 41 PM" src="https://user-images.githubusercontent.com/106039830/209448979-65dd8a61-81cd-48eb-9e1a-4f24e09b8b46.png">

Time Complexity: O(n)

## Method 2: Iterative - Pointers

Iterative approach using 3 pointers: a previous pointer, a current pointer, and a next pointer.

At the beginning:

<img width="938" alt="Screen Shot 2022-12-24 at 1 38 16 PM" src="https://user-images.githubusercontent.com/106039830/209449217-88f52847-1caf-4f4b-ab7a-1c39bc58c594.png">

After first loop:
<img width="938" alt="Screen Shot 2022-12-24 at 1 39 23 PM" src="https://user-images.githubusercontent.com/106039830/209449251-8a60ded2-cf0c-4600-8ea4-e135b28cc437.png">

After second loop:
<img width="933" alt="Screen Shot 2022-12-24 at 1 43 50 PM" src="https://user-images.githubusercontent.com/106039830/209449273-9e2603ca-155d-442f-93ad-765970e10265.png">


Time Complexity: O(n)
