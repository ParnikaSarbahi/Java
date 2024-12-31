import java.util.*;
public class Patterns {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(i==1 || i==n || j==1 || j==m){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        */
        /*
        for (int i=4;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        */
        /*
        for(int i=4;i>0;i--){
            for(int j=0;j<=4;j++){
                if(j<i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        */
        /*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        */
        /*
        for(int i=5;i>=1;i--){
            for(int j=1;j<=5;j++){
                if(j<=i){
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        */
        /*
        int n=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=i){
                    System.out.print(n+" ");
                    n+=1;
                }
            }
            System.out.println();
        }*/
        /*
        int n=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if(j<=i){
                if((j+i)%2==0){
                    System.out.print(1);
                }
                else{
                    System.out.print(0);
                }
            }
            }
            System.out.println();
        }
        */
        /*
        for(int i=1;i<=4;i++){
            String spaces="";
            for(int j=1;j<=8-2*i;j++){
                spaces+=" ";
            }
            String stars="*".repeat(i);
            System.out.println(stars+spaces+stars);
        }
        for(int i=4;i>=1;i--){
            String spaces="";
            for(int j=1;j<=8-2*i;j++){
                spaces+=" ";
            }
            String stars="*".repeat(i);
            System.out.println(stars+spaces+stars);
        }
        */
        /*
        for(int i=5;i>=1;i--){
            String spaces="";
            for(int j=1;j<=i-1;j++){
                spaces+=" ";
            }
            String stars="*".repeat(5);
            System.out.println(spaces+stars);
        }  
        */
        /*
        for(int i=1;i<=5;i++){
            String spaces="";
            for(int j=1;j<=5-i;j++){
                spaces+=" ";
            }
            String tp=(Integer.toString(i)+" ").repeat(i);
            System.out.println(spaces+tp);
        }
        */
        /*
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int k=2;k<=i;k++){
                System.out.print(k);
            }
            System.out.println();
        }
        */
        int n=4;
        for(int i=1;i<=n;i++){
            String spaces="";
            for(int j=1;j<=n-i;j++){
                spaces+=" ";
            }
            String stars="";
            for(int j=1;j<=2*i-1;j++){
                stars+="*";
            }
            System.out.println(spaces+stars);
        }
        for(int i=n;i>=1;i--){
            String spaces="";
            for(int j=1;j<=n-i;j++){
                spaces+=" ";
            }
            String stars="";
            for(int j=1;j<=2*i-1;j++){
                stars+="*";
            }
            System.out.println(spaces+stars);
        }
        sc.close();


    }
    
}
