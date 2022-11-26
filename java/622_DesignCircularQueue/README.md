## Method 1: Implementation using arrays

We need 4 public fields: the array of length k, capacity of the array (for easier computation), the current size of the array, a front pointer and a 
tail / rear pointer. At the beginning, we set the front pointer to point at index 0, which represents the start index of the array. The tail index will 
be front + size - 1, so will be -1 at the beginning. Next time we would want to add or remove an element, we will need to update the front pointer / tail
pointer first.</br>
<img width="223" alt="Screen Shot 2022-11-26 at 4 47 34 PM" src="https://user-images.githubusercontent.com/106039830/204111617-31a3103a-ca03-4d11-ad94-0c98eccd3556.png">
