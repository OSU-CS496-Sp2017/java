import java.util.Stack;

class GenericsExample {
  public static void main(String[] args) {

    Stack<Integer> intStack = new Stack<Integer>();
    for (int i = 0; i < 10; i++) {
      intStack.push(new Integer(i));
    }

    while (!intStack.empty()) {
      System.out.println(intStack.pop());
    }

    Stack<String> strStack = new Stack<String>();
    for (int i = 0; i < 10; i++) {
      strStack.push(String.valueOf(i) + String.valueOf(i));
    }

    while (!strStack.empty()) {
      System.out.println(strStack.pop());
    }

  }
}
