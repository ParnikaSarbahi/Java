public class Opt_MaximumSubarray {
    void sumsubarray(int[] arr){
        int maxsum=Integer.MIN_VALUE;

        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currSum=i==0?prefix[j]:prefix[j]-prefix[i-1];
                if(maxsum<currSum){
                    maxsum=currSum;
                }
            }
        }
        System.out.println("max sum is:"+maxsum);
    }
    public static void main(String[] args) {
        int[] arr={1,-2,6,-1,3};
        Opt_MaximumSubarray ob=new Opt_MaximumSubarray();
        ob.sumsubarray(arr);
    }
}
