package Task61;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

  //Дана последовательность слов (количество, а затем и сами слова, каждое слово с новой строки).
  //
  //Вывести все самые короткие слова через пробел.
  //
  //Оценить временную и пространственную сложность алгоритма.
  public static void main(String[] args) {        // time = O(n)    space = O(n)
    Scanner scanner = new Scanner(System.in);     // O(1)            // O(1)

    int n = scanner.nextInt();                    // O(n)            // O(1)
    scanner.nextLine();

    ArrayList<String> words = new ArrayList<>();  // O(n)            // O(n)

    for (int i = 0; i < n; i++) {                 // O(n)            // O(1)
      words.add(scanner.nextLine());              // O(n)            // O(1)
    }

    int shortsWord = Integer.MAX_VALUE;           // O(n)            // O(n)
    for (String word : words) {                   // O(n)            // O(n)
      shortsWord = Math.min(shortsWord, word.length()); // O(n)      // O(1)
    }

    for (String word : words) {                    // O(n)            // O(n)
      if (word.length() == shortsWord) {           // O(n)            // O(n)
        System.out.print(word + " ");              // O(n)            // O(1)
      }
    }
  }
}