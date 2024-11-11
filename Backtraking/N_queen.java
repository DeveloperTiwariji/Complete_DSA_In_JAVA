import java.util.*;

public class N_queen{
    public static void main(String[] args){
        int n =4;
        boolean board[][] = new boolean[n][n];
        queen(board, 0, n);
    }

    public static boolean isItSafe(boolean board[][], int row, int col){

        int r =row;
        int c = col;

        while(r>=0){     // upper 
            if(board[r][col]){
                return false;
            }
            r--;
        }
        
        r =row;
        c = col;

        while(r>=0 && c>=0){  // Left ===;
            if(board[r][c]){
                return false;
            }
            r--;
            c--;
        }

        r=row;
        c= col;

        while(r>=0 && c<board.length){ // right 
            if(board[r][c]){
                return false;
            }
            r--;
            c++;
        }
        return true;
 
    }



    public static void queen(boolean board[][], int row, int q){
        if(q==0){
            display(board);
            return;
            } 
        for(int col = 0;col<board.length;col++){ 
            if(isItSafe(board, row, col)){
                board[row][col] = true;
                queen(board, row+1, q-1);
                board[row][col] = false;
            }
        }
    }
    public static void display(boolean [][]board){

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
}