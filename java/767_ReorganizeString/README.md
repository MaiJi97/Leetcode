## Method 1: Priority Queue + Greedy Algorithm

First count the frequency of each character in the string. Then the approach here is to always pick the most frequent character to append to a string builder (to order
the characters by frequency, we use a priority queue / max heap). Then from the rest of the elements, pick the next frequent character to append. Keep iterating until
the queue becomes empty. At this point we can check if the last character still has more than one occurrence. If not, append the last occurrence and return the final
string; else return "" since the goal is not achievable.

Time Complexity: O(nlogk)
