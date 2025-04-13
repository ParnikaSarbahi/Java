import java.util.*;
public class HashSet {
    public static void main(String[] args) {
        Set<Integer> numbers=new java.util.HashSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.add(10);
        for(int number:numbers){
            System.out.println(number);
        }

    
        if(numbers.contains(10)){
            System.out.println(10+" is in the set");
        }else{
            System.out.println(10+" not in set");
        }
        System.out.println("Size of set is: "+numbers.size());

        numbers.remove(10);
        if(numbers.contains(10)){
            System.out.println(10+" is still in the set");
        }else{
            System.out.println(10+" has been removed from the set now");
        }
        System.out.println("Size of set now is: "+numbers.size());
    }
}
