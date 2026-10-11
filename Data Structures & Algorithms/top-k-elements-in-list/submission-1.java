class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //fucking love hashmaps
        int len = nums.length;
        HashMap<Integer, Integer> m = new HashMap<>();
        int max = 0;
        for(int i = 0; i < len; i++){
            if(m.containsKey(nums[i])){
                int x = m.get(nums[i]) +1;
                m.put(nums[i],x);
                if(x>max){
                    max = x;
                }
            }else{
                m.put(nums[i], 1);
            }
        }
        int[] score = new int[k];
        int index = 0;
        for(int i = 0; i<k;i++){
            int nmax = 0;
            int nmaxVal = -1;
            for(Integer x : m.keySet()){
                int y = m.get(x);
                if(y>nmax){
                    nmax = y;
                    nmaxVal = x;
                }
            }
            score[index] = nmaxVal;
            index++;
            m.remove(nmaxVal);
            max = nmax;
        }
        return score;
    }
}
