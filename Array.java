import java.util.*;
public class Array {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
    /*#class notes
    //type[] arrayName=new type[size];
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int marks[]={97,98,95};
    marks[0]=97;
    marks[1]=98;
    marks[2]=95;
    System.out.println(marks[0]);
    System.out.println(marks[1]);
    System.out.println(marks[2]);
    
    int[] number=new int[n];
    for(int i=0;i<n;i++){
        number[i]=sc.nextInt();
    }
    for(int i=0;i<number.length;i++){
        System.out.println(number[i]);
    }
    */
    /*
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    String[] names=new String[n];
    for(int i=0;i<n;i++){
        names[i]=sc.next();
    }
    for(int i=0;i<names.length;i++){
        System.out.println("Name no. "+(i+1)+" is:"+names[i]);
    }
    */
    /*
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int integers[]=new int[n];
    for(int i=0;i<n;i++){
        integers[i]=sc.nextInt();
    }
    int min=integers[0];
    int max=integers[0];
    for(int i=0;i<integers.length;i++){
        if(integers[i]<min){
            min=integers[i];
        }
        if(integers[i]>max){
            max=integers[i];
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(integers[i]);
    }
    System.out.println();
    System.out.println(min+" "+max);
    */
    System.out.println("Enter size of array");
    int n=sc.nextInt();
    int integers[]=new int[n];
    for(int i=0;i<n;i++){
        integers[i]=sc.nextInt();
    }
    boolean isascending=true;
    for(int i=0;i<integers.length-1;i++){
        if(integers[i]>integers[i+1]){
            isascending=false;
        }
    }
    if(isascending)
    System.out.println("Array sorted");
    else{
        System.out.println("Array not sorted");
    }
    sc.close();
}
}