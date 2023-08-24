package Task64;
import Task63.Book;
import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    List<Book> books = new ArrayList<>();
    books.add(new Book("Author 1", "Book 1", 100));
    books.add(new Book("Author 1", "Book 2", 200));
    books.add(new Book("Author 1", "Book 3", 150));
    books.add(new Book("Author 1", "Book 4", 120));

    books.stream()
        .sorted((o1, o2) -> {
          int result = o1.getAuthor().compareTo(o2.getAuthor());
          if (result == 0) {
            result = o1.getTitle().compareTo(o2.getTitle());
          }
          return result;
        })
        .forEach(book -> System.out.println(book));
  }
}