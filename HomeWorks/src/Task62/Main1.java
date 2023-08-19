package Task62;

public class Main1 {

  // Напишите рекурсивный метод public static String reverse(int x),
  // который будет возвращать строку,
  // содержащую десятичные цифры числа в обратном порядке (развернёт число).

  // public static String reverse(int x) {
  //  if (x >= 0 && x < 10) {
  //    return Integer.toString(x);
  //  }
  //  int digit = x % 10;
  //  int number = x / 10;
  //  return Integer.toString(digit) + reverse(number);
  // }
  public static String reverse(int x) {
    if (x >= 0 && x < 10) {
      return Integer.toString(x);
    } else {
      int digit = x % 10;
      int number = x / 10;
      StringBuilder reverseDigit = new StringBuilder();
      reverseDigit.append(digit);
      reverseDigit.append(reverse(number));
      return reverseDigit.toString();
    }
  }

  public static void main(String[] args) {
    int forNumber = 834124124;
    String theRevers = reverse(forNumber);
    System.out.println("Реверсное число: " + theRevers);
  }
}