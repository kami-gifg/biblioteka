package pl.studia.biblioteka;

/** Maly scenariusz pokazujacy dzialanie biblioteki. */
public final class Main {
  private Main() {}

  /** Punkt startowy programu. */
  public static void main(final String[] args) {
    final Library library = new Library();
    library.addBook(new Book("Pan Tadeusz", "Adam Mickiewicz"));
    library.addBook(new Book("Lalka", "Boleslaw Prus"));
    final Member anna = new Member("Anna");
    library.addMember(anna);

    System.out.println("Ksiazek: " + library.countBooks());
    System.out.println("Wypozyczenie: " + library.borrowBook(anna, "Lalka"));
    System.out.println("Anna ma ksiazek: " + anna.getBorrowedBooks().size());
    System.out.println("Ponowne wypozyczenie: " + library.borrowBook(anna, "Lalka"));
    System.out.println("Zwrot: " + library.returnBook(anna, "Lalka"));
    System.out.println("Anna ma ksiazek: " + anna.getBorrowedBooks().size());
  }
}
