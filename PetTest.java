import pets.*;

import java.time.LocalDateTime;

class PetTest {
  public static void main(String args[]) {
    Cat c = new Cat("Francis");
    Dog d = new Dog("Fido");

    System.out.println(c.getName() + " says " + c.says());
    System.out.println(d.getName() + " says " + d.says());

    System.out.println("Is is now " + LocalDateTime.now());
  }
}
