/*array is fixed size,continuous memory. 
Stores primitive data types like int/float etc and objects*/

/*ArrayList is variable in size with memory non-continous. 
Stores Objects only jese hee bante wese hee arraylist me add karlo, primitive me pehle se memory banani padti
Made in Heap */

import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {
    public static void main(String srgs[]){
        //ArrayList stores objects so we have to use Integer class instead of int to make it
        ArrayList<Integer> list=new ArrayList<Integer>();

        //add element
        list.add(0);
        list.add(2);
        list.add(3);
        System.out.println(list);

        //get elements
        int element=list.get(2);
        System.out.println(element);

        //add element
        list.add(1,1);//(index,element)
        System.out.println(list);

        //set element
        list.set(0,5);
        System.out.println(list);

        //delete element
        list.remove(0);
        System.out.println(list);

        //size 
        int size=list.size();
        System.out.println(size);

        //for loop
        for(int ele : list){
            System.out.print(ele+" ");
        }

        System.out.println();
        
        //sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
