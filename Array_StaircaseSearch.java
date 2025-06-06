public class Array_StaircaseSearch {
    boolean StaircaseSearch(int[][] arr,int key){
        int row=0,col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==key){
                System.out.println("key found at:("+row+","+col+")");
                return true;
            }
            else if(key<arr[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("item no found");
        return false;
    }
    public static void main(String[] args) {
        int[][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        Array_StaircaseSearch ob=new Array_StaircaseSearch();
        int key=11;
        ob.StaircaseSearch(arr,key);
    }
}
