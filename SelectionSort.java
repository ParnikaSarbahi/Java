public class SelectionSort {
    
    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] selectionsort(int arr[]){
        for (int i=0;i<arr.length-1;i++){
            int smallest=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallest]>arr[j]){
                    smallest=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[smallest];
            arr[smallest]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={7,8,3,1,2};
        arr=selectionsort(arr);
        printarray(arr);    
    }
}
