class array{
    void printpairednum(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++)
                System.out.println("("+arr[i]+arr[j]+")");
        }
    }

    public static void main(String[] args) {
        int[] arr={2,4,6,8,10};
        array ob=new array();
        ob.printpairednum(arr);
    }
}
