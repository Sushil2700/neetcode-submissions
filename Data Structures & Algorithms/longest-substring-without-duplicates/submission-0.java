class Solution {
    public int lengthOfLongestSubstring(String s) {
        int score = 0;
        int l = s.length();
        for(int i = 0; i< l; i++){
            int t = 0;
            HashMap<Character, Integer> m = new HashMap<Character, Integer>();
            for(int j = i; j < l; j++){
                char c = s.charAt(j);
                if(m.containsKey(c)){

                    t = j-i;
                    if(t>score){
                        score = t;
                        System.out.println("Broken at, j = "+j+" i = "+i+" score = "+score);
                    }
                    
                    break;

                }else{
                    m.put(c,0);
                }
                if(j+1 == l){
                    if(l-i > score){
                        score = l-i;
                    }
                    return score;
                }

            }

        }

        return score;
    }
}
