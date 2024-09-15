import java.util.*;

public class Decimal_to_Binary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n =sc.nextInt();
        int mul =1;
        int sum =0;
        while(n>0){
            int rem = n%2;
            sum = sum+rem*mul;
            mul = mul*10;
            n = n/2;
        }
        System.out.println("Binary number of "+n+" is "+ sum);
    }
}