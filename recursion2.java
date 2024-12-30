import java.util.HashSet;

public class recursion2 {
    // O(2^n)
    public static void towerOfHanoi(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("transfer disk"+n+"from"+src+"to"+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, helper);
        System.out.println("transfer disk"+n+"from"+src+"to"+dest);
        towerOfHanoi(n,helper,src,dest);
    }
    public static void rev(String str,int n){
        if(n==0){
            System.out.println(str.charAt(n));
            return;
        }
        System.out.print(str.charAt(n));
        rev(str,n-1);
    }


    public static int first=-1;
    public static int last=-1;
    public static void occur(String s,char element,int index){
        if(index==s.length()){
            System.out.println("First occurence at "+first);
            System.out.println("Last occurence at "+last);
            return;
        }
        if(s.charAt(index)==element){
            if(first==-1){
                first=index;
            }
            else{
                last=index;
            }
        }
        occur(s, element, index+1);
    }
    public static boolean c=true;
    public static boolean check(int arr[],int index){
        if(index==arr.length-1){
            return c;
        }
        if (arr[index]<arr[index+1]) {
            return check(arr, index+1);
        }
        else{
            c=false;
            return c;
        }
    }

    public static int counter=0;
    public static void x(String s,int index){
        if(index==s.length()){
            System.out.print("x".repeat(counter));
            return;
        }
        if(s.charAt(index)!='x'){
            System.out.print(s.charAt(index));
            x(s,index+1);
        }
        else{
            counter++;
            x(s,index+1);
        }
    }
    public static boolean[] map=new boolean[26];
    public static void rem(String str,int ind,String newString){
        if(ind==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(ind);
        if(map[currChar-'a']){
            rem(str, ind+1, newString);
        }
        else{
            newString+=currChar;
            map[currChar-'a']=true;
            rem(str, ind+1, newString);
        }
    }
    public static void subseq(String str,int ind,String newString){
        if(ind==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(ind);
        subseq(str,ind+1,newString+currChar);
        subseq(str,ind+1,newString);
    }
    public static void uniquesubseq(String str,int ind,String newString,HashSet<String> set){
        if(ind==str.length()){
            if(set.contains(newString)){
                return;
            }
            else{
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar=str.charAt(ind);
 
        uniquesubseq(str,ind+1,newString+currChar,set);
        uniquesubseq(str,ind+1,newString,set);
    }
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void prtcomb(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar=str.charAt(idx);
        String mapping=keypad[currChar-'0'];
        for(int i=0;i<mapping.length();i++){
            prtcomb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args){
        //int n=3;
        //towerOfHanoi(n,"S","H","D");
        //String str="abcde";
        //rev(str,str.length()-1);
        //occur("abcdeabcbace", 'a',0);
        //int s[]={2,4,5,5,6,7};
        //boolean a=check(s,0);
        //System.out.println("Array is increasing?:"+a);
        //x("axbcxxxd",0);
        //rem("abbccda",0,"");
        //subseq("abc",0, "");
        //String str="aaa";
        //HashSet<String> set=new HashSet<>();
        //uniquesubseq(str, 0,"",set);
        String str="23";
        prtcomb(str, 0,"");
    }
}
  