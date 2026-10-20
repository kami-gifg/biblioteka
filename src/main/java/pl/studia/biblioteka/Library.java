package pl.studia.biblioteka;

import java.util.ArrayList;
import java.util.List;

/** Biblioteka: zarzadza ksiazkami i czytelnikami. */
public class Library {
  private final List<Book> books = new ArrayList<>();
  private final List<Member> members = new ArrayList<>();

  /** Dodaje ksiazke do zbioru biblioteki. */
  public void addBook(final Book book) {
    books.add(book);
  }

  /** Zapisuje czytelnika do biblioteki. */
  public void addMember(final Member member) {
    members.add(member);
  }

  /** Zwraca liczbe ksiazek w zbiorze. */
  public int countBooks() {
    return books.size();
  }

  /** Zwraca liczbe czytelnikow. */
  public int countMembers() {
    return members.size();
  }

  /**
   * Wypozycza czytelnikowi wolna ksiazke o podanym tytule.
   *
   * @param member czytelnik
   * @param title tytul
   * @return true, jesli wypozyczenie sie udalo
   */
  public boolean borrowBook(final Member member, final String title) {
    for (Book book : books) {
      if (book.getTitle().equals(title) && !book.isBorrowed()) {
        book.setBorrowed(true);
        member.addBook(book);
        return true;
      }
    }
    return false;
  }

  /**
   * Przyjmuje zwrot ksiazki od czytelnika.
   *
   * @param member czytelnik
   * @param title tytul
   * @return true, jesli czytelnik mial taka ksiazke
   */
  public boolean returnBook(final Member member, final String title) {
    for (Book book : member.getBorrowedBooks()) {
      if (book.getTitle().equals(title)) {
        book.setBorrowed(false);
        member.removeBook(book);
        return true;
      }
    }
    return false;
  }
}
