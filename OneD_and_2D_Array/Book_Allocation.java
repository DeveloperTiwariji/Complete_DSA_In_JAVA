import java.util.*;

public class Book_Allocation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int nos = sc.nextInt();
        System.out.print("Enter the number of book: ");
        int nob = sc.nextInt();
        int arr[] = new int[nob];
        for(int i=0;i<nob;i++){
            arr[i] = sc.nextInt();
        }
        int min = MinPage(arr,nos);
        System.out.println(min);
    }
    public static int MinPage(int a[],int nos){
        int lo =0;
        int hi =0;
        for(int i=0;i<a.length;i++){
            hi = hi+a[i];
        }
        int ans =0;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(itIsPosibale(a,nos,mid)==true){
                ans =mid;
                hi = mid-1;
            }else{
                lo = mid+1;
            }
        }
        return ans;
    }

    public static boolean itIsPosibale(int a[],int nos,int mid){
        int studentco = 1;
        int readpage =0;
        for(int i=0;i<a.length;i++){
            if(readpage+a[i]<=mid){
                readpage = readpage+a[i];
            }else{
                studentco++;
                readpage = a[i];
            }
            if(studentco>nos){
                return false;
            }
        }
        return true;
    }
}