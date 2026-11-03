class Solution {
    public boolean isValidSudoku(char[][] board) {
    
    //check all rows
           for(int i = 0 ; i < 9 ; i++){
            Set<Character> names = new HashSet<>();
            for(int j = 0 ; j < 9; j++){
                char c = board[i][j];
                if(c == '.') continue;
                if(names.contains(c)) return false;
                    names.add(c);
            }}
    // check all columns
        for(int i = 0 ; i < 9 ; i++){
            Set<Character> names = new HashSet<>();
            for(int j = 0 ; j < 9; j++){
                char c = board[j][i];
                if(c == '.') continue;
                if(names.contains(c)) return false;
                    names.add(c);
            }}        
    //check all grids
        
        for(int y = 0; y < 3; y++){
            for(int x = 0; x<3; x++){
                Set<Character> names = new HashSet<>();
                for(int i = 0; i<3; i++){
                    for(int j = 0; j < 3; j++){
                        char ts = board[y*3 + j][x*3+i];
                        if(ts == '.')continue;
                        if(names.contains(ts)) return false;
                        names.add(ts);
                    }
                 }
            }
        }
            
      
        
    return true;
    }
    
    
}
    
    
    
    
    
    
    