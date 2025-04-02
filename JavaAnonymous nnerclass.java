 class Animal {
   void makeSound(){
   }
 }

 public class TestAnonymousInner {
   public static void main(String args[]) {
     //Anonymous Inner Class  
    Animal animal = new Animal() {
       void makeSound() {
         System.out.println(“Check Animal ");
        }
    };
    animal.makeSound();
   }
 }

abstract class Person{
   abstract void eat();
}
class TestAnonymousInner{
 public static void main(String args[]){
   //Anonymous Inner Class  
  Person p=new Person(){
     void eat(){System.out.println("nice fruits");}
 };
 p.eat();
}
}
