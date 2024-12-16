import java.util.*;

public class BinSearchIterative {
    public static int binSeachIt(int arr[],int n,int key){
        int low=0,high=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key<arr[mid]){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        int n=arr.length;
        System.out.println("Enter number to search:");
        int key=sc.nextInt();
        int ans=binSeachIt(arr,n,key);
        System.out.println(ans);
        sc.close();
    }
}
