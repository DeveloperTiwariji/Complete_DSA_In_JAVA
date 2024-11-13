import java.util.*;

public class Prime_Sieve{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int  n = sc.nextInt();
        boolean prime[] = new boolean[n+1];
        for(int i=2;i<prime.length;i++){
            prime[i] = true;
        }

        PrimeSieve(prime);
        for(int i=2;i<prime.length;i++){
            if(prime[i] ==true){
                System.out.print(i+" ");
            }
        }
    }
    public static void PrimeSieve(boolean prime[]){

        for(int i=2;i*i<prime.length;i++){
            if(prime[i] ==true){
                for(int j=2;j*i<prime.length;j++){
                    prime[i*j] = false;
                }
            }
        }
    }
}