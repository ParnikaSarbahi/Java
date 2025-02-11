class Student{
    int rollno;String name; //instance variable
    static String college ="UPES";//static variable
    Student(int r,String n){
      rollno = r; name = n;
    }
    void display (){
      System.out.println(rollno+" "+name+" "+college);
    }
}
public class TestStaticVariable{
    public static void main(String args[]){
      Student s1 = new Student(1,"Raj");
      Student s2 = new Student(2,"Rohan");
      s1.display();
      s2.display();
      Student.college="University of petroleum and Energy Studies";
      s1.display();
      s2.display();
    }
}
