class Solution {
    static int dp[][]= new int [101][10001];

    public int superEggDrop(int k, int n) {
        for(int row[]: dp)
            Arrays.fill(row, -1);
        return solve(k,n);
    }
    public int solve(int e, int f){
        if (f == 1 || f == 0)
            return f;
        if (e == 1)
            return f;
        
        if (dp[e][f] != -1)
            return dp[e][f];
        
        int left = 1, right = f;
        int min= Integer.MAX_VALUE;
        
        while (left <= right)
        {
            int mid = left + (right - left) / 2; 

            int down = solve(e - 1, mid - 1); 

            int up = solve(e, f - mid);
            
            int temp = 1 + Math.max(down, up);
            //adding one because we have used 1 attempt and max of up and down because
            //we need worst case attempts from both
            
            if(down < up)
                left = mid + 1;
            else
                right = mid - 1;
        
             min = Math.min(temp, min); //min because we have to find the min no. of moves   
            }
        
        return dp[e][f]=min;  
    }
}
