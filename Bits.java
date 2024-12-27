public class Bits {
    public static void main(String[] args) 
    {
        //GET-BIT first calculate bitmask then AND
        /*
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        if((bitmask & n)==0){
            System.out.println("Bit was zero");
        }else{
            System.out.println("bit was one");
        }
        */

        //SET-BIT first calculate bitmask then OR
        /*
        int n=5;
        int pos=1;
        int bitmask=1<<pos;

        int newnumber=bitmask|n;
        System.out.println(newnumber);
        */

        //CLEAR-BIT first calculate bitmask then AND with NOT
        /*
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int notbitmask=~(bitmask);

        int newnumber=notbitmask & n;
        System.out.println(newnumber);
        */
    
        //UPDATE-BIT input choice, agar 0 banana to CLEAR, 1 to SET
        
      }
}
