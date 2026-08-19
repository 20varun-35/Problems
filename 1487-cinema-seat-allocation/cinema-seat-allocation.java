class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,Set<Integer>> hm = new HashMap<>();
        for(int[] x:reservedSeats){
            int row = x[0];
            int col = x[1];
            hm.computeIfAbsent(row,k->new HashSet<>()).add(col);
        }
        int ans = 0;
        for(Set<Integer> r : hm.values()){
            boolean left = !r.contains(2) && !r.contains(3) && !r.contains(4) && !r.contains(5); 
            boolean middle = !r.contains(4) && !r.contains(5) && !r.contains(6) && !r.contains(7); 
            boolean right = !r.contains(6) && !r.contains(7) && !r.contains(8) && !r.contains(9);
            if(left && right){
                ans+=2;
            }else if(left || right || middle){
                ans+=1;
            }
        }
        int emptyrows = n-hm.size();
        ans = ans+(emptyrows*2);
        return ans;
    }
}