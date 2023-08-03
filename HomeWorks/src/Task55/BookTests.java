package Task55;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class BookTests {
  // Напишите автотесты с использованием JUnit для задачи 1
  //  из предыдущего домашнего задания 54.
  //
  // Проверьте краевые случаи, предусмотрите разные варианты.

  @Test
  public void testBookTitleAuthorComparator() {
    // arrange
    Book book1 = new Book("Author1", "Title1", 100);
    Book book2 = new Book("Author2", "Title2", 200);
    Book book3 = new Book("Author3", "Title3", 300);
    List<Book> bookList = new ArrayList<>();
    bookList.add(book3);
    bookList.add(book1);
    bookList.add(book2);

    // act
    Collections.sort(bookList, new BookTitleAuthorComparator());

    // assert
    assertEquals(book1, bookList.get(0));
    assertEquals(book2, bookList.get(1));
    assertEquals(book3, bookList.get(2));
  }
}
