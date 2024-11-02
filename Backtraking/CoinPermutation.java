import java.util.*;

public class CoinPermutation{
    public static void main(String[] args){
        int [] coin = {2, 3, 6, 7};
        int amount = 7;
        Permutation(coin,amount,"");
    }
    public static void Permutation(int [] coin, int amount, String ans){
       
       if(amount == 0){
        System.out.println(ans);
        return;
       }

        for(int i =0;i<coin.length;i++){
            if(amount >= coin[i]){
                Permutation(coin, amount-coin[i], ans+coin[i]);
            }
        }
    }
}