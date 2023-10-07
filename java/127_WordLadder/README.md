## Method 1: BFS / Level Order Traverse through Queue 

<img width="1089" alt="Screen Shot 2022-06-19 at 10 29 59 AM" src="https://user-images.githubusercontent.com/106039830/186805695-6ef0360c-c894-4522-a05a-10530474280d.png">

有明显分层, size = queue.size() - for loop </br>
For each element/word pop out of the queue, we modify one character and check it is in the word list. If it is, then we count it as a neighbor of the current node and add it to the queue / visited set. </br>

Why need to convert the word list array list to a hash set? Because hash set contains method takes O(1) while array list takes O(n)

Time Complexity: 
M is the size of the word list. 
N is the length of each word in the list. 
O(N) to loop over each word in the word list. 
O(M) to loop for each character. 
O(M) to convert word to char array, convert char array to string and to compare two string. 
O(M) * O(N) * 26 * (O(M) + O(M)) = O（M ^ 2 * N)
