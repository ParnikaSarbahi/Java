public class Array_KadanMaximumSubarray {
    public static void kadanes(int[] num){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        for(int i=0;i<num.length;i++){
            if(cs+num[i]<0){
                cs=0;
            }
            else{
                cs+=num[i];
            }
            ms=ms<cs?cs:ms;
        }
        System.out.println(ms);
    }

    //separate code needed to handle a test case where all numbers are negative in which we would return the smallest negative number
    public static void main(String[] args) {
        int[] arr={-2,-3,4,-1,-2,1,5,-3};
        kadanes(arr);
    }
}
