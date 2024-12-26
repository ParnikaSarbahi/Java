import java.util.*;

public class ZigZagPrintArray {
    public static void main(String args[]){
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
            if(i%2==0){
                for(int j=0;j<column;j++)
                    System.out.print(numbers[i][j]+" ");
            }
            else{
                for(int j=column-1;j>=0;j--)
                    System.out.print(numbers[i][j]+" ");
            }
        }
        sc.close();
    }
}
