class Solution {

    public String encode(List<String> strs) {
        // how this will work for my solution, for the first part i will use a list that is initialised inot the string itself, in order to track the indexes that should a
        int counter = 0;
        String text = "";
        String breaks = "";
        String score = "";
        
        for(String item : strs){
            
            text += item;
            counter += item.length();
            breaks += String.valueOf(counter) + ",";          
            
        }
        // concat
        
        score += breaks + "|" + text;
        
        System.out.println("encoded |"+score);
                
        return score;
    }

    public List<String> decode(String str) {
        List<String> score = new ArrayList<>();
        int len = str.length();
        
        List<Integer> stack = new ArrayList<>();
        
        int c = 0;
        String temp = "";
        while (str.charAt(c) != '|'){
            if(str.charAt(c) == ','){
                if(temp.length() == 0){
                    c++;
                    continue;
                }
                stack.add(Integer.parseInt(temp));
                temp = "";


            }else{
            temp += str.charAt(c);}
            c++;
        }
        //Stop counting the breaks
        //Start parsing the list.
        c++; // so that we go past the |.

        str = str.substring(c);
        
        int start = 0;
        for(int end : stack){
            score.add(str.substring(start,end));
            start = end;
        }        
        
        return score;
    }}