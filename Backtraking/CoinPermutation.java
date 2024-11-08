import java.util.*;

public class CoinPermutation{
    public static void main(String[] args){
        int [] coin = {1, 2, 3};
        int amount = 4;
        System.out.println(Permutation(coin,amount,""));
    }
    public static int Permutation(int [] coin, int amount, String ans){
       
       if(amount == 0){
        System.out.println(ans);
        return 1;
       }
        
        int count =0;
        for(int i =0;i<coin.length;i++){
            if(amount >= coin[i]){
               count+=  Permutation(coin, amount-coin[i], ans+coin[i]);
            }
        }
        return count;
    }
}