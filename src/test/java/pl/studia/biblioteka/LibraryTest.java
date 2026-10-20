package pl.studia.biblioteka;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LibraryTest {
  private Library library;
  private Member anna;

  @BeforeEach
  void setUp() {
    library = new Library();
    library.addBook(new Book("Lalka", "Boleslaw Prus"));
    anna = new Member("Anna");
    library.addMember(anna);
  }

  @Test
  void borrowAvailableBookShouldSucceed() {
    assertTrue(library.borrowBook(anna, "Lalka"));
    assertEquals(1, anna.getBorrowedBooks().size());
  }

  @Test
  void borrowSameBookTwiceShouldFail() {
    library.borrowBook(anna, "Lalka");
    assertFalse(library.borrowBook(anna, "Lalka"));
  }

  @Test
  void returnBookShouldFreeIt() {
    library.borrowBook(anna, "Lalka");
    assertTrue(library.returnBook(anna, "Lalka"));
    assertEquals(0, anna.getBorrowedBooks().size());
    assertTrue(library.borrowBook(anna, "Lalka"));
  }
}
