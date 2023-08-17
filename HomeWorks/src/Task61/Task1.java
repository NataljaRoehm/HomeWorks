package Task61;

import java.util.Scanner;

public class Task1 {

  //Найти минимальное чётное число в последовательности положительных чисел или вывести -1,
  // если такого числа не существует.
  //
  //Оценить временную и пространственную сложность алгоритма.
  public static void main(String[] args) {      // time = O(n)    space = O(1)
    Scanner scanner = new Scanner(System.in);   // O(1)            // O(1)
    int minEvenNumber = Integer.MAX_VALUE;      // O(n)            // O(n)
    int n = scanner.nextInt();                  // O(n)            // O(1)

    for (int i = 0; i < n; i++) {               // n раз = O(n)    // +O(1)
      int num = scanner.nextInt();              // - O(1)          +O(1)
      if (num % 2 == 0 && num < minEvenNumber) {//  O(n)           // O(1)
        minEvenNumber = num;                    //  O(1)           // O(1)
      }
    }

    if (minEvenNumber == Integer.MAX_VALUE) {   //  O(1)           // O(1)
      System.out.println(-1);                   //  O(1)           // O(1)
    } else {
      System.out.println(minEvenNumber);        //  O(1)           // O(1)
    }
  }
}