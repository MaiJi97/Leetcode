## Method 1: BFS / Level Order Traverse through Queue 

Similar as problem 127 word ladder.

有明显分层, size = queue.size() - for loop </br>
For each element/word pop out of the queue, we modify one character and check it is in the word list. If it is, then we count it as a neighbor of the current node 
and add it to the queue / visited set. 

Why need to convert the word list array list to a hash set? Because hash set contains method takes O(1) while array list takes O(n)

Time Complexity: </br>
M is the size of the word list. </br>
N is the length of each word in the list. </br>
O(N) to loop over each word in the word list. </br>
O(M) to loop for each character. </br>
O(M) to convert word to char array, convert char array to string and to compare two string. <br>
O(M) * O(N) * 26 * (O(M) + O(M)) = O（M ^ 2 * N)
