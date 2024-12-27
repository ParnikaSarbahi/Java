//Java strings are immutable

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        String name=sc.next(); without space
        String fname=sc.nextLine(); with space
    
        charAt() ek character ka access

        s1.compareTo(s2) compares three cases
        1) s1>s2: any +ve value returned
        2) s1 == s2: 0
        3) s1 < s2 : any -ve value returned
        // == se nahi compare karte kyuki strings are objects in java and the way theye stored uski functioning different hai 

        storage=s.substring(beg,end)
        s.lenght() 

        */

        String str = "123";
        int number = Integer.parseInt(str);
        System.out.println(number);

        String str2 = Integer.toString(number);
        System.out.println(str2+" "+str2.length());

        StringBuilder sb=new StringBuilder("Tony");

        System.out.println(sb);
        System.out.println(sb.charAt(2));

        sb.setCharAt(0,'P'); 
        sb.insert(2,'n');
        sb.delete(2,4);
        System.out.println(sb); 
        sc.close();

        //Reverse a String (using StringBuilder class)
        StringBuilder sb2 = new StringBuilder("HelloWorld");
    
        for(int i=0; i<sb2.length()/2; i++) {
            int front = i;
            int back = sb2.length() - i - 1;


            char frontChar = sb2.charAt(front);
            char backChar = sb2.charAt(back);


            sb2.setCharAt(front, backChar);
            sb2.setCharAt(back, frontChar);
        }


        System.out.println(sb2);

    }

}
