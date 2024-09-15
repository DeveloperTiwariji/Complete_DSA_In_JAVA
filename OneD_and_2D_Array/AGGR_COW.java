import java.util.*;

public class AGGR_COW{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stall: ");
        int stall = sc.nextInt();
        System.out.print("Enter the number of cow: ");
        int  N_Of_Cow = sc.nextInt();
        int arr[] = new int[stall];
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        int L_P_D =MinimumLargePosibleDistance(arr,N_Of_Cow);
        System.out.println("Minimum Large Posibale distance of cow is: "+L_P_D);
    }
    public static int MinimumLargePosibleDistance(int arr[],int nc){
        int Lo_Po = 0;
        int High_Po = arr.length-1;
        int ans =0;
        while(Lo_Po<=High_Po){
            int mid = (Lo_Po+High_Po)/2;
            if(itIsPosibale(arr,nc,mid)==true){
                ans = mid;
                Lo_Po = mid+1;
            }else{
                High_Po = mid-1;
            }
        }

        return ans;
    }

    public static boolean itIsPosibale(int a[],int nc,int mid){
        int positio = a[0];
        int cowCounte =1;
        for(int i=1;i<a.length;i++){
            if(a[i]-positio>=mid){
                cowCounte++;
                positio = a[i];
            }
            if(nc == cowCounte){
                return true;
            }
        }
        return false;
    }
}