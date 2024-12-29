import java.util.*;
public class Recursion {
    public static void printNumb(int n){
        if(n==6)
         return;
        System.out.println(n);
        printNumb(n+1);
    } 
    public static int summ(int n){
        if(n==0){
            return 0;
        }
        return n+summ(n-1);
    }
    public static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    //stack height is n
    public static int power(int n,int i){
        if(i==0){
            return 1;
        }
        if(n==0){
            return 0;
        }
        return n*power(n,--i);
    }
    // stack height is logn
    public static int efficientpow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        if(n%2==0){
            return efficientpow(x,n/2)*efficientpow(x,n/2);
        }
        else{
            return efficientpow(x,n/2)*efficientpow(x,n/2)*x;
        }
        
    }
    public static void fibo(int a,int b,int n){
        if(n==0){
            return;
        }
        int s=a+b;
        System.out.print(" "+s);
        fibo(b,s,n-1);
    }

     
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //printNumb(1);
        
        //System.out.println(summ(10));

        //System.out.println(fact(4));

        /*System.out.println("Enter value of n:");
        int n=sc.nextInt();
        System.out.print("0"+" 1");
        fibo(0,1,n-2 );*/
        int ans=power(2,4);
        System.out.println(ans);
        int ans2=efficientpow(2,4);
        System.out.println(ans2);
        sc.close();
    }
}
