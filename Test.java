class Test {
  public static void main(String[] args) {
    System.out.println("I have a cat named " + c.getName());

    System.out.println("A cat says " + Cat.says());

    // Object o = new Cat("Francis");
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

  }
}
