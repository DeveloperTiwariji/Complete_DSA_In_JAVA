import java.util.*;

public class MaxStringSubArray{
    public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		String st = sc.next();
        int flipa = MaxLenOfString(st,'a',k);
        int flipb = MaxLenOfString(st,'b',k);
        System.out.println(Math.max(flipa,flipb));
		}
    public static int MaxLenOfString(String st,char c,int k){
        int ei =0;
		int es =0;
		int flip =0;
		int n =st.length();
		int ans =0;
		while(es<n){
			if(st.charAt(es) == c){
				flip++;
			}
			while(flip>k && ei<=es){
				if(st.charAt(ei) ==c){
					flip--;
				}
				ei++;
			}
			ans =Math.max(es-ei+1, ans);
			es++;
        }
        return ans;
    }
}