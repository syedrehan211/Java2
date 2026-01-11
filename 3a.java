class MethodOverloadingExample {
 static int addition(int x, int y) {
      return x + y;
   }
  static double addition(int x, double y) {
      return x + y;
   }
 public static void main(String[] args) {
      int a = addition(8, 8);
      double b = addition(4, 5.2);
      System.out.println("addition of integers: " + a);
      System.out.println("addition of double values: " + b);
   }
}
Output:
addition of integers: 16
addition of integers and double values: 9.2

