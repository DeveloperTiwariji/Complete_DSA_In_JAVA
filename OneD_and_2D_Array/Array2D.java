import java.util.*;

public class Array2D{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = sc.nextInt();
        System.out.print("Enter the number of colomn: ");
        int colomn = sc.nextInt();
        int arr[][] = new int[row][colomn];
        for(int i=0;i<row;i++){
            for(int j=0;j<colomn;j++){
                arr[i][j] =sc.nextInt();
            }
        }
        System.out.println("The 2D array is: ");
        Display(arr);
    }

    public static void Display(int a[][]){
        int row = a.length;
        int colomn = a[0].length;

        for(int i=0;i<colomn;i++){
            if(i%2==0){
                for(int j=0;j<row;j++){
                    System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }else{
                for(int j=row-1;j>=0;j--){
                    System.out.print(a[j][i]+" ");
                }
                System.out.println();
            }
        }
    }
}