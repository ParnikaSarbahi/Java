package pack;
class Student{
  private String name;//private data member
  public String getName(){//getter method for name
    return name;
  }
  //setter method for name
  public void setName(String name){
    this.name=name;
  }
}
public class Test{
public static void main(String[] args){
//creating instance of the encapsulated class
Student s=new Student();
//setting value in the name member
s.setName("vijay");
//getting value of the name member
System.out.println(s.getName());
}
}
