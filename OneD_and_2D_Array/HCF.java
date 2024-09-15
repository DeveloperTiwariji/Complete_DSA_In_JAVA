import java.util.*;

public class HCF{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Give the Two number witch you wants HCF: ");
        System.out.print("Enter the first number: ");
        int first_n =sc.nextInt();
        System.out.print("Enter the second number: ");
        int second_n = sc.nextInt();
        int divident;
        int divisor;
        if(first_n>second_n){
            divident = first_n;
            divisor = second_n;
        }else{
            divident = second_n;
            divisor = first_n;
        }

        while(divident % divisor!=0){
            int rem = divident%divisor;
            divident = divisor;
            divisor = rem;
        }
        System.out.print("HCF of number "+first_n+" and number "+second_n +" is "+divisor);
    }
}