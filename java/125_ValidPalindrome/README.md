## Method 1: Two Pointers 相向双指针

Set two pointers, one goes from left to right, the other goes from right to left. We can compare the two character that the two pointers are pointing at and determine if the string is palindromic or not. 

Note: another way to clean the string 
String m = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase()

Instead of cleaning the string and create a new string at the beginning, we can also carry out this operation within the while loop. To do that, we add if statements within the while loop to check if the character is a valid character. If it is not a letter or a digit, we update the pointers. <br />

Time Complexity: O(n)
