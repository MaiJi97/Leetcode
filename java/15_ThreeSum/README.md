## Method 1: Two Pointers
Use a for loop to go through the array, and for each number, solve a two sum sorted array problem using two pointers. </br>
A difficulty is that there might be duplicate in the result list returned, so we will have to keep incrementing / decrementing the pointers to skip duplicates. </br>
Another way to deal with duplicates is to use a hashset to store the result and convert the hashset to a list in the end. </br>

Time Complexity: O(n^2)
