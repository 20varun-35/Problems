class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] merge = new int[n+m];
        for(int i=0;i<n;i++){
            merge[i]=nums2[i];
        }
        for(int i=n;i<m+n;i++){
            merge[i]=nums1[i-n];
        }
        Arrays.sort(merge);
        float median=0;
        if((n+m)%2 == 0){
            median = (float)(merge[(n+m)/2]+merge[((n+m)/2)-1])/2;
        }
        else{
            median = merge[(n+m)/2];
        }
        return median;
    }
}