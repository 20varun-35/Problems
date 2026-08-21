class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> li = new ArrayList<>();
        for(String word : words){
            Map<Character,Character> m = new HashMap<>();
            Map<Character,Character> r = new HashMap<>();
            boolean valid = true;
            for(int i=0;i<pattern.length();i++){
                char p = pattern.charAt(i);
                char w = word.charAt(i);
                if(m.containsKey(p) && m.get(p)!=w){
                    valid = false;
                    break;
                }
                if(r.containsKey(w) && r.get(w)!=p){
                    valid = false;
                    break;
                }
                m.put(p,w);
                r.put(w,p);
            }
            if(valid){
                li.add(word);
            }
        }
        return li;
    }
}