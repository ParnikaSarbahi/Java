import java.util.*;
public class Array2D {
    public static void main(String args[]){
        //type[][] arrayName=new type[rows][columns];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows=sc.nextInt();
        System.out.println("Enter number of columns:");
        int column=sc.nextInt();
        int[][] numbers=new int[rows][column];
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.println("Enter number for row "+i+" column "+j);
                numbers[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                System.out.print(numbers[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Enter value of x");
        int x=sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<column;j++){
                if(numbers[i][j]==x){
                 System.out.println(x+" found at "+(i)+"row "+(j)+" column");
                }
            }
        }
        sc.close();
    }
}
