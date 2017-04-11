import pets.Cat;
import pets.Dog;

class PetExample {
  public static void main(String args[]) {
    Cat c = new Cat("Francis");
    Dog d = new Dog("Fido");

    System.out.println("A cat says " + Cat.says());

    System.out.println("I have a cat named " + c.getName());

    System.out.println(c.getName() + " says " + c.says());
    System.out.println(d.getName() + " says " + d.says());
  }
}
