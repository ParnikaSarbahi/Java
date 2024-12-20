public class Fibonacci {
    public static void main(String args[]){
        int low=1;
        int high=1;
        System.out.print(low+" ");
        while(high<=50){
            System.out.print(high+" ");
            high=low+high;
            low=high-low;
        }
    }
}
