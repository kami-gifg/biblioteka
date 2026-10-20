package pl.studia.biblioteka;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/** Czytelnik biblioteki. */
public class Member {
  private final String name;
  private final List<Book> borrowedBooks = new ArrayList<>();

  /**
   * Tworzy czytelnika.
   *
   * @param name imie czytelnika
   */
  public Member(final String name) {
    this.name = name;
  }

  /** Zwraca imie czytelnika. */
  public String getName() {
    return name;
  }

  /** Zwraca niemodyfikowalna liste wypozyczonych ksiazek. */
  public List<Book> getBorrowedBooks() {
    return Collections.unmodifiableList(borrowedBooks);
  }

  /** Dodaje ksiazke do wypozyczonych. */
  public void addBook(final Book book) {
    borrowedBooks.add(book);
  }

  /** Usuwa ksiazke z wypozyczonych. */
  public void removeBook(final Book book) {
    borrowedBooks.remove(book);
  }
}
