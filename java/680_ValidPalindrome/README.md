 ## Method 1: Two Pointers 相向双指针 with a helper to check normal palindrome
 
A brute force approach is to delete each character and check if or not the rest of thestring is a palindrome, though the time complexity could be O(n^2). Another approach is to reuse the aimplementation of Valid Palindrome I.  When we reach the case that two characters are not equal, we check to see if incrementing the left pointer or decrementing the right pointer will resolve the problem by calling a helper method to check normal palindrome. </br>

Time Complexity: O(n)
