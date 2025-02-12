class Address {
  String city;
  String state;
  Address(String city, String state) {
    this.city = city;
    this.state = state;
  }

  String getFormattedAddress() {
      return city + ", " + state;
    }
}

class Person {
    String name;
    Address address = new Address(“Dehradun", “UK");
    Person(String name) {
      this.name = name;
    }
    void display() {
      System.out.println(name + " lives in " +
      address.getFormattedAddress());
    }
}
public class Main {
  public static void main(String[] args) {
      Person person = new Person(“Anuj");
      person.display();
    }
}
