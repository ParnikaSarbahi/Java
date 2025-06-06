import java.util.*;
public class Array_SpiralMatrix {

    void SpiralPrint(int[][] arr){
        int startRow=0;
        int startCol=0;
        int endRow=arr.length-1;
        int endColumn=arr[0].length-1;
        
        while(startCol<=endColumn && startRow<=endRow){
            //top
            for(int j=startCol;j<=endColumn;j++){
                System.out.println(arr[startRow][j]);
            }
            //right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.println(arr[i][endColumn]);
            }
            //bottom
            for(int j=endColumn-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.println(arr[endRow][j]);
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
                if(startCol==endColumn){
                    break;
                }
                System.out.println(arr[i][startCol]);
            }
            startRow++;startCol++;
            endColumn--;endRow--;
        }

    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Array_SpiralMatrix ob=new Array_SpiralMatrix();
        ob.SpiralPrint(arr);
    }
}
