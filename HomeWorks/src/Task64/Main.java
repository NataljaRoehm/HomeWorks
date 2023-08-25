package Task64;
import Task63.Book;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
  // Создайте список книг.
  //
  //Отсортируйте книги по автору, (при одинаковых авторах - по названиям)
  // и выведите получившийся список с использованием потоков.

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Author 3", "Book 5", 100));
    books.add(new Book("Author 1", "Book 3", 200));
    books.add(new Book("Author 1", "Book 3", 150));
    books.add(new Book("Author 2", "Book 1", 120));

    books.stream()
        .sorted((o1, o2) -> {
          int result = o1.getAuthor().compareTo(o2.getAuthor());
          if (result != 0) {
           return result;
          }
          return o1.getTitle().compareTo(o2.getTitle());
        })
        .forEach(o -> System.out.println(o));
  }
}