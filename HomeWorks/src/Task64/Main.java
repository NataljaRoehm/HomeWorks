package Task64;

import Task63.Book;
import java.util.stream.Stream;

public class Main {
  // Создайте список книг.
  //
  //Отсортируйте книги по автору, (при одинаковых авторах - по названиям)
  // и выведите получившийся список с использованием потоков.

  public static void main(String[] args) {
    Stream.of(
        new Book("Другой автор", "Book 5", 100),
        new Book("Автор", "Book 3", 200),
        new Book("Другой автор", "Book 3", 150),
        new Book("Автор", "Book 1", 120)
    ).sorted((o1, o2) ->  {
      int authors = o1.getAuthor().compareTo(o2.getAuthor());
      if (authors != 0) {
        return authors;
      }
      return o1.getTitle().compareTo(o2.getTitle());
    }).forEach(System.out::println);
  }
}