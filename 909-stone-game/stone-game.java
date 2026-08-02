class Solution {
    public boolean stoneGame(int[] piles) {
        int n = piles.length;
        Integer[][] dp = new Integer[n][n];
        return solve(dp,0,n-1,piles)>=0;
    }
    public int solve(Integer[][] dp , int left , int right, int[] nums){
        if(left==right)
            return nums[left];
        if(dp[left][right]!=null)
            return dp[left][right];
        int pickleft = nums[left] - solve(dp,left+1,right,nums);
        int pickright = nums[right] - solve(dp,left,right-1,nums);
        return dp[left][right]=Math.max(pickleft,pickright);
    }
}