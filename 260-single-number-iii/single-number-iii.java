class Solution {
    public int[] singleNumber(int[] nums) {
        int[] ans = new int[2];
        Set<Integer> hs = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(hs.contains(nums[i])){
                hs.remove(nums[i]);
            }
            else hs.add(nums[i]);
        }
        int i=0;
        for(int x : hs){
            ans[i++]=x;
        }
        return ans;
    }
}