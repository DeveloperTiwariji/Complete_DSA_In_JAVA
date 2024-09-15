import java.util.*;

public class Fibonocci{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
       int a =0;
       int b =1;
       System.out.print(a+ " ");
       System.out.print(b+ " ");

        for(int i=2;i<n;i++){
            int c = a+b;
            a =b ;
            b =c;
            System.out.print(c+" ");
        }

    }
}