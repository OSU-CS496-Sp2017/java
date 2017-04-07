package pets;

public class Dog {
  private String name;

  // Constructor
  public Dog(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static String says() {
    return "woof";
  }
}
