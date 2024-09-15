import java.util.*;

public class primeNo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int flag = 0;
        int s = 0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                flag =1;
            }else{s++;}
        }
        if(flag==0){
            System.out.println("Given number is prime ");
        }else{
            System.out.println("Given number is not prime");
        }
        System.out.println(s);
    }
}