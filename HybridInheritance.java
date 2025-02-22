interface A {
  default void foo() {
    System.out.println("Default method in Interface A");
  } 
}
interface B extends A {
  default void foo() {
    System.out.println("Default method in Interface B");
  } 
}
interface C extends A {
  default void foo() {
    System.out.println("Default method in Interface C");
  } 
}
class D implements B, C {
  public void foo() {
    System.out.println("Overridden method in Class D");
    B.super.foo(); // Calling the default method from Interface B
    //super use hota hai jab ek class ke pass multiple parents hote hain (via interfaces) aur usko batana padta hai ki kaunsa parent ka method call karna hai.
  }
}
public class Main {
  public static void main(String[] args) {
    D obj = new D();
    obj.foo();
  }
}
