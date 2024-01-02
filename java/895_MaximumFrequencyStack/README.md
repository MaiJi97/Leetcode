## Method 1: Hash Map + Priority Queue

Each time we would want to pop up the most frequent element, which reminds us of priority queue. We can use a priority queue to store both the element and
the frequency it appears and sort elements in the priority queue according to the frequency. A hash map is needed to keep track of the current frequency
of an element. In addition, in case there are two elements of same frequency in the stack, we need another variable to keep track of the order an element
is pushed onto the stack, and add this as a part of the comparator of the priority queue.

Time Complexity: O(1)

## Method 2: Hash Map + Bucket Sort

We can also solve this problem without using a priority queue. Instead we can create another map of structure <frequency, stack of elements of this frequency> 
to store the elements and their frequency. We need a stack instead of a simple array list as we need to keep track of the order of elements pushed onto the stack
in case of breaking a tie. Also, as we push elements onto the stack, we use a variable to track the maximum frequency of the elements on the stack.
As we pop, we pop from the stack of elements which have the maximum frequency out of the stack. The idea is similar as a bucket sort, where we set the frequency
of elements as the key and a list of elements of this frequency as the value.

Time Complexity: O(1)
