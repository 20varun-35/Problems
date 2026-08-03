class Solution {
    public String stoneGameIII(int[] stoneValue) {
        int n  = stoneValue.length;
        Integer[] dp = new Integer[n];
        int diff = solve(dp,0,n,stoneValue);
        if(diff>0) return "Alice";
        else if(diff<0) return "Bob";
        return "Tie";
    }
    public static int solve(Integer[] dp,int i,int n, int[] value){
        if(i>=n) return 0;
        if(dp[i]!=null) return dp[i];
        int currSum = 0;
        int best = Integer.MIN_VALUE;
        for(int k=0;k<3 && i+k<n;k++){
            currSum += value[i+k];
            best = Math.max(best,currSum - solve(dp,i+k+1,n,value));
        }
        return dp[i]=best;
    }
}