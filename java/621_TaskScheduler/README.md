## Method 1: Priority Queue + Greedy Algorithm

The problem is similar to problem 767 and 358 but still different. In problem 767 and 358, we proceed only if the constraint of k 
distance apart satisfies, while in this problem, we will always proceed (if the constraint does not satisfy, just increment the 
current count). Also we just need the total count in this problem, instead of the specific order of the tasks. Therefore, we just 
need to store the frequency of each element into the priority queue instead of <element, frequency> as a pair; and we need to increment
count to meet the need if the stack does not have as many as tasks to fill the interval between two same task.

Time Complexity: O(nlogn)
