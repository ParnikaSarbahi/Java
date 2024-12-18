public class BinSearchRec{
    public static int Rec(int A[],int low,int high,int key){
        if(low==high){
            if(A[low]==key)
                return low;
            else
                return -1;
        }
        else{
            int mid=(low+high)/2;
            if(key==A[mid])
                return mid;
            if(key<A[mid])
                return Rec(A,low,mid-1, key);
            else
                return Rec(A,mid+1,high,key);

        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        int answer=Rec(arr,0,arr.length-1,7);
        System.out.println(answer);
    }
    
}
