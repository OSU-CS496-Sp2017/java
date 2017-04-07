package pets;

public class Cat {
  private static final int INIT_LIVES = 9;
  private String name;

  // Constructor
  public Cat(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static String says() {
    return "meow";
  }
}
