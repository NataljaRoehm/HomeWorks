package Task63;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    List<Book>books=new ArrayList<>();
    books.add(new Book("Author","Book",100));
    books.add(new Book("Author4","Book4",140));
    books.add(new Book("Author2","Book2",200));
    books.add(new Book("Author3","Book3",210));

    Collections.sort(books, new Comparator<Book>() {
      @Override
      public int compare(Book o1, Book o2) {
        int authorCompare = o1.getAuthor().compareTo(o2.getAuthor());
        if (authorCompare != 0) {
          return authorCompare;

        }
        return o1.getTitle().compareTo(o2.getTitle());
      }
    });
    for (Book book: books){
      System.out.println(book);
    }
  }
}
