import java.util.*;

public class Sum_even_ood_place{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int sum1 =0;
        int sum =0;
        while(n>0){
            int a =n%10;
            sum = sum*10+a;
            n= n/10;
        }
        int sum2 =0;
        int i=1;
        while(sum>0){
            int a =sum%10;
            if(i%2==0){
                sum1 = sum1+a;
            }else{
                sum2 =sum2+a;
            }
            sum= sum/10;
            i++;
        }
        System.out.println(sum1+"  "+ sum2);
    }
}