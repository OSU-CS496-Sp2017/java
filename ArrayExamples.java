public class ArrayExamples {
  public static void main(String[] args) {
    int n = 6;
    int[] array = new int[n];
    array[0] = 0;
    System.out.println("array[0] is " + array[0]);
    // array[1000] = 1000;  // This is a runtime error for going out of bounds.

    for (int i = 0; i < array.length; i++) {
      array[i] = i * i;
    }

    for (int elem : array) {
      System.out.println(elem);
    }

    int[][] matrix = new int[4][8];
    // for (int i = 0; i < matrix.length; i++) {
    //   matrix[i] = new int[8];
    // }

    int[] array2 = new int[5];
    array2[0] = 10;
    System.out.println("array2[0]: " + array2[0]);

    array2 = array;
    System.out.println("array2[0]: " + array2[0]);
    array2[1] = 1000000;

    System.out.println("array[1]: " + array[1]);
  }
}
