class Solution {
    public int largestInteger(int[] nums, int k) {
     int n = nums.length;
     int ans = -1;
     PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
     for(int num : nums){
        maxHeap.add(num);
     }   
     while(true){
        Map<Integer,Integer> hm = new HashMap<>(); 
        int freq = 0;
        int max = maxHeap.poll();
        for(int i=0;i<k;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        if(hm.containsKey(max)) freq++;
        for(int i=k;i<n;i++){
            hm.put(nums[i-k],hm.get(nums[i-k])-1);
            if(hm.get(nums[i-k])==0){
                hm.remove(nums[i-k]);
            }
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if(hm.containsKey(max)) freq++;
        }
        if(freq==1){
            ans = max;
            break;
        }
        if(maxHeap.isEmpty()){
            break;
        }
     }
     return ans;
    }
}