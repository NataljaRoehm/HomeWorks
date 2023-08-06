package Task55;

import java.util.Objects;

public class Book implements Comparable<Book> {

  private final String author;
  private final String title;
  private final int page;

  public Book(String author, String title, int page) {
    this.author = author;
    this.title = title;
    this.page = page;
  }

  public String getAuthor() {
    return author;
  }

  public String getTitle() {
    return title;
  }

  public int getPage() {
    return page;
  }

  @Override
  public String toString() {
    return "Book{" +
        "author='" + author + '\'' +
        ", title='" + title + '\'' +
        ", page=" + page +
        '}';
  }

  @Override
  public int compareTo(Book o) {
    if (author.compareTo(o.author) != 0) {
      return author.compareTo(o.author);
    }
    if (title.compareTo(o.title) != 0) {
      return title.compareTo(o.title);
    }
    return 0;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Book book)) {
      return false;
    }

    if (page != book.page) {
      return false;
    }
    if (!Objects.equals(author, book.author)) {
      return false;
    }
    return Objects.equals(title, book.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, title, page);
  }
}
