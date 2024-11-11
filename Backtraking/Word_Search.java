import java.util.*;

public class Word_Search{
    public static void main(String[] args){
        char board[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){

                if(board[i][j] == word.charAt(0)){

                    boolean ans = WordSearch(board, i, j, word, 0);
                    if(ans == true){
                        System.out.println(ans);
                        break;
                    }
                }
            }
        }
        System.out.println(false);
    }

    public static boolean WordSearch(char board[][], int r, int c, String word, int idx){
        
       if(idx == word.length()){
        return true;
       }
       if(r< 0 || c<0 || r >=board.length || c>=board[0].length || board[r][c]!=word.charAt(idx)){
        return false;
       }

        board[r][c] = '*';
        int cr[] = {0, 0, -1, 1};
        int cc[] = {-1, 1, 0, 0};
        // WordSearch(board, r, c-1, word, idx+1);
        // WordSearch(board,r, c+1, word, idx+1);
        // WordSearch(board,r-1, c, word, idx+1);
        // WordSearch(board,r+1, c, word, idx+1);

        for(int i=0;i<cr.length;i++){
            boolean ans = WordSearch(board, r+cr[i], c+cc[i], word, idx+1);
            if(ans){
                return ans;
            }
        }
        board[r][c] = word.charAt(idx);
        return false;
    }
}