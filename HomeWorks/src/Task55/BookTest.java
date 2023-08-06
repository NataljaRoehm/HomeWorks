package Task55;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BookTest {

  @Test
  void getAuthor() {
    Book book = new Book("Author", "Title", 12);
    assertEquals("Author", book.getAuthor());
  }

  @Test
  void getTitle() {
    Book book = new Book("Author", "Title", 12);
    assertEquals("Title", book.getTitle());
  }

  @Test
  void getPage() {
    Book book = new Book("Author", "Title", 12);
    assertEquals(12, book.getPage());
  }

  @Test
  void testToString() {
    Book book = new Book("Author", "Title", 12);
    String expectedString = "Book{author='Author', title='Title', page=12}";
    assertEquals(expectedString, book.toString());
  }

  @Test
  void compareTo() {
    Book book1 = new Book("Author1", "Title", 12);
    Book book2 = new Book("Author2", "Title", 12);
    assertTrue(book1.compareTo(book2) < 0);

    Book book3 = new Book("Author", "Title1", 12);
    Book book4 = new Book("Author", "Title2", 12);
    assertTrue(book3.compareTo(book4) < 0);

    Book book5 = new Book("Author", "Title", 12);
    Book book6 = new Book("Author", "Title", 12);
    assertEquals(0, book5.compareTo(book6));
  }

  @Test
  void testEquals() {
    Book book1 = new Book("Author", "Title", 12);
    Book book2 = new Book("Author", "Title", 12);
    assertTrue(book1.equals(book2));
    Book book3 = new Book("Author1", "Title", 12);
    Book book4 = new Book("Author2", "Title", 12);
    assertFalse(book3.equals(book4));
    Book book5 = new Book("Author", "Title1", 12);
    Book book6 = new Book("Author", "Title2", 12);
    assertFalse(book5.equals(book6));
    Book book7 = new Book("Author", "Title", 12);
    assertFalse(book7.equals(null));
  }

  @Test
  void testHashCode() {
    Book book1 = new Book("Author", "Title", 12);
    Book book2 = new Book("Author", "Title", 12);
    assertEquals(book1.hashCode(), book2.hashCode());
  }
}