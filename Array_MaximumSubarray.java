public class MaximumSubarray {
    void sumsubarray(int[] arr){
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(maxsum<sum){
                    maxsum=sum;
                }
            }
        }
        System.out.println("Maximum sum is: "+maxsum);
    }
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        MaximumSubarray ob=new MaximumSubarray();
        ob.sumsubarray(arr);
    }
}
