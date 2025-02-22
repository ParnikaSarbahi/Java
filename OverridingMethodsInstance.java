// Define an interface with a default method
interface MyInterface {
  default void display() {
  System.out.println("This is the default method in MyInterface.");
  } 
}

// Define a class that overrides the default method
class MyClass implements MyInterface {
  @Override
  public void display() {
  System.out.println("This is the overridden method in MyClass.");
  } 
}

// Another interface that extends MyInterface and overrides the default method
interface ExtendedInterface extends MyInterface {
  @Override
  default void display() {
    System.out.println("This is the overridden method in ExtendedInterface.");
  } 
}

// A class that implements ExtendedInterface class ExtendedClass implements ExtendedInterface {}
public class OverrideDefaultMethodDemo {
    public static void main(String[] args) {
      MyClass obj1 = new MyClass();
      obj1.display(); // Outputs: "This is the overridden method in MyClass."
      ExtendedClass obj2 = new ExtendedClass();
      obj2.display(); // Outputs: "This is the overridden method in ExtendedInterface."
    } 
}
