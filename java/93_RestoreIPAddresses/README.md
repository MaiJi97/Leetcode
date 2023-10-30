## Method 1: DFS / Traverse through recursion - backtracking

We have a helper method that takes in parameters regarding the current state, including the result list, the current list and an 
index up to which we partition. In the helper method, break the recursion when the current list contains characters up to the last
character of the string. Return is void as we just need to add the current list to the final result if there are exactly four 
IPs in the current list, or else just return. Else we find all the substring starting from the current index that is a valid IP 
address and call the method recursively on the next index after the end of the substring. After the recursive call, we need to take 
one step back and remove the last IP address we found to allow the pick up of other options.

Time Complexity: 

<img width="481" alt="Screen Shot 2023-10-30 at 1 24 25 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/25bfd0f8-d3e6-4558-8f07-9c81adafb96f.png">
