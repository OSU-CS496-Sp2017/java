import java.time.LocalDateTime;

class JavaClassesExample {
  public static void main(String[] args) {
    String greeting = new String("Hello world!");
    System.out.println("string length: " + greeting.length());
    System.out.println("character 3: " + greeting.charAt(3));
    if (greeting.equals("Hello world!")) {
      System.out.println("The strings are the same");
    }
    if (greeting == "Hello world!") {
      System.out.println("The strings are the same the second time");
    }
    System.out.println(greeting.replace("world", "everyone"));

    System.out.println(String.valueOf(3.1415));

    double pi = Double.parseDouble("3.1415");
    int i = Integer.parseInt("10");

    // Using the imported LocalDateTime class.
    System.out.println("Is is now " + LocalDateTime.now());
  }
}
