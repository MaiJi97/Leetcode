## Method 1: Priority Queue + Greedy Algorithm

First count the frequency of each character in the string. Then the approach here is to always pick the most frequent character to append to a string builder (to order the characters by frequency, we use a priority queue / max heap). Then from the rest of the elements, pick the next frequent character to append. Keep iterating until the queue becomes empty. At this point we can check if the last character still has more than one occurrence. If not, append the last occurrence and return the final string; else return "" since the goal is not achievable.

<img width="522" alt="Screen Shot 2023-10-15 at 7 36 57 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/d3a43f9e-515c-45d9-84a3-73a61856674c.png">

Time Complexity: O(nlogk) where n is the length of the string and k is the number of unique characters in the string
