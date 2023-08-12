## Method 1: Two Pointers 相向双指针

Two Sum变种 - 除了经典Two Sum that looks for an exact element使用hash map，其他的基本都使用Two Pointers. First sort the array. Then use a for loop to go through the array, and for each number, solve a two sum sorted array problem using two pointers. 

A difficulty is that there might be duplicate in the result list returned: if we do not include the two while loops in the first conditional statement, there is the possibility duplicate result will be added to the result list. So we will have to keep incrementing / decrementing the pointers to skip duplicates. Pointer i also needs to be incremented to skip the duplicates.

Another way to eliminate duplicates is to use a hashset to store the result and convert the hashset to a list in the end. </br>
Calling the contains() method on the result list does not seem to work. 

Time Complexity: O(n^2)
