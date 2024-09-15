import java.util.*;

public class Spiral_of_2Darray{
    public static void main(String[] args){

        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16},{17,18,19,20}};
        int minr =0;
        int minc =0;
        int maxr =  matrix.length-1;
        int maxc = matrix[0].length-1;
        int counte =0;
        int totalElement = matrix.length*matrix[0].length;
        while(counte<totalElement){
        for(int i=minc;i<=maxc;i++){
            System.out.print(matrix[minr][i]+" ");
            counte++;
        }
        minr++;
        for(int i=minr;i<=maxr;i++){
            System.out.print(matrix[i][maxc]+" ");
            counte++;
        }
        maxc--;
        for(int i=maxc;i>=minc;i--){
            System.out.print(matrix[maxr][i]+" ");
            counte++;
        }
        maxr--;
        for(int i =maxr;i>=minr;i--){
            System.out.print(matrix[i][minc]+" ");
            counte++;
        }
        minc++;
        }

    }
}