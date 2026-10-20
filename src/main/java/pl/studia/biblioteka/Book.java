package pl.studia.biblioteka;

/** Ksiazka w bibliotece. */
public class Book {
  private final String title;
  private final String author;
  private boolean borrowed;

  /**
   * Tworzy ksiazke.
   *
   * @param title tytul
   * @param author autor
   */
  public Book(final String title, final String author) {
    this.title = title;
    this.author = author;
  }

  /** Zwraca tytul. */
  public String getTitle() {
    return title;
  }

  /** Zwraca autora. */
  public String getAuthor() {
    return author;
  }

  /** Zwraca true, jesli ksiazka jest wypozyczona. */
  public boolean isBorrowed() {
    return borrowed;
  }

  /** Ustawia status wypozyczenia. */
  public void setBorrowed(final boolean borrowed) {
    this.borrowed = borrowed;
  }
}
