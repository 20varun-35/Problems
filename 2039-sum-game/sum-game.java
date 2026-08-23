class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int qleft = 0;
        int qright = 0;
        int diff = 0;
        for(int i=0;i<n/2;i++){
            if(num.charAt(i)=='?'){
                qleft++;
            }else{
                diff+=num.charAt(i)-'0';
            }
        }
        for(int i=n/2;i<n;i++){
            if(num.charAt(i)=='?'){
                qright++;
            }else{
                diff-=num.charAt(i)-'0';
            }
        }
        if((qleft+qright)%2==1)
            return true;
        return diff!=(qright-qleft)*9/2;
    }
}