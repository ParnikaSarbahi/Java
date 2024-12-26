import java.util.*;
public class arrays {
    static Scanner sc = new Scanner(System.in);

    public static int[] makeINTarray(int n){
        int[] Array=new int[n];
        System.out.println("Enter values:");
        for(int i=0;i<n;i++){
            Array[i]=sc.nextInt();
        }
        return Array;
    }
    public static float[] makeFLOATarray(int n){
        float[] Array=new float[n];
        System.out.println("Enter values:");
        for(int i=0;i<n;i++){
            Array[i]=sc.nextFloat();
        }
        return Array;
    }
    public static String[] makeSTRINGarray(int n){
        String[] Array=new String[n];
        System.out.println("Enter values:");
        for(int i=0;i<n;i++){
            Array[i]=sc.next();
        }
        return Array;
    }
    public static boolean[] makeBOOLEANarray(int n){
        boolean[] Array=new boolean[n];
        System.out.println("Enter values:");
        for(int i=0;i<n;i++){
            Array[i]=sc.nextBoolean();
        }
        return Array;
    }

    public static void main(String args[]){
        //type[] arrayName=new type[size];
        System.out.print("Input size of array:");
        int size=sc.nextInt();
        System.out.println("Input 1 for int, 2 for float, 3 for string, 4 for boolean:");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                int[] iArray=makeINTarray(size);
                break;
            case 2:
                float[] FloatArray =makeFLOATarray(size);
                break;
            case 3:
                String[] stringArray=makeSTRINGarray(size);
                break;
            case 4:
                boolean[] booleanArray=makeBOOLEANarray(size);
                break;
        }
    }
}
