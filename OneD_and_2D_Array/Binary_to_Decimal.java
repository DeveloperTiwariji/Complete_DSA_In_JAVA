import java.util.*;

public class Binary_to_Decimal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary number: ");
        long n = sc.nextLong();
        long mul =1;
        long sum =0;
        while(n>0){
            long rem = n%10;
            sum =sum+rem*mul;
            mul =mul*2;
            n = n/10;
        }
        System.out.println("Decimal number of number "+n +" is "+sum);
    }
}