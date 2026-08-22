class Solution {
    public int removeAlmostEqualCharacters(String word) {
        int count = 0;
        int n = word.length();
        StringBuilder sb = new StringBuilder(word);
        for(int i=1;i<sb.length();i++){
            if(Math.abs(sb.charAt(i)-sb.charAt(i-1))<=1){
                count++;
                i++;
            }
        }
        return count;
    }
}