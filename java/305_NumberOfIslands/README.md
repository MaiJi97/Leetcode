## Method 1: Union Find 

Union Find Basic:
<img width="796" alt="Screen Shot 2023-05-31 at 3 33 15 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/8175cfe5-8717-4af6-b8f0-7f972e68c89f.png">

<img width="792" alt="Screen Shot 2023-05-31 at 3 40 18 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/5a8cb792-0d4c-485e-b38c-396d887c80f5.png">

<img width="895" alt="Screen Shot 2023-05-31 at 4 23 03 PM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/e5ce204a-0f0d-4df6-8bc3-3987116f4bb4.png">

Union find can be either improved with size (weight) or rank:
<img width="1158" alt="Screen Shot 2023-06-01 at 10 44 49 AM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/325bc71a-1f13-4db0-af82-fe137169e0e4.png">

<img width="1126" alt="Screen Shot 2023-06-01 at 10 45 00 AM" src="https://github.com/MaiJi97/Leetcode/assets/106039830/d5558ee0-dc17-4165-ad9e-30b336bc9db7.png">


In this problem, the number of islands is dynamically changing, so we need to use union find to continuously check if the block and its
adjacent blocks have the same root parent / belong to the same island. If they do not , we merge (union) them. Note that in the union find, parent stores the island each block belongs to, and n * x + y is the way we perform linear mapping. Also note that what we want here is the number of islands / number of root parents.

Time Complexity: O(M * N + L log(UF)) if union find is improved.
