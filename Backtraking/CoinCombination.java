import java.util.*;

public class CoinCombination{
    public static void main(String[] args){
        int [] coin = {10,1,2,7,6,1,5};
        int amount = 8;
        System.out.println(Permutation(coin,amount,"",0));
    }
    public static int Permutation(int [] coin, int amount, String ans, int idx){
       
       if(amount == 0){
        System.out.println(ans);
        
        return 1;
       }
        
        int count =0;
        for(int i =idx;i<coin.length;i++){
            if(amount >= coin[i]){
               count = count+ Permutation(coin, amount-coin[i], ans+coin[i], i+1);
            }
        }
        return count;
    }
}