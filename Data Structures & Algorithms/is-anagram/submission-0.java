class Solution {
    public boolean isAnagram(String s, String t) {
        int count  = s.length();
        if(count!=t.length()){return false;}
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa); Arrays.sort(ta);
        for(int i = 0; i<count;i++){
            if(sa[i]!=ta[i]){
                return false;
            }
        }
        return true;
    }
}
