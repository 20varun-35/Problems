class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> li = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        HashSet<Integer> hs = new HashSet<>();
        for(int x : nums){
            min = Math.min(min,x);
            max = Math.max(max,x);
            hs.add(x);
        }
        for(int i=min;i<max;i++){
            if(!hs.contains(i)){
                li.add(i);
            }
        }
        return li;
    }
}