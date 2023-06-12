import java.util.Objects;

public class Book {
    private final String nameOfTheBook;
    private final Author author;
    private int yearOfPublication;

    public Book(String nameOfTheBook, Author author, int yearOfPublication) {
        this.nameOfTheBook = nameOfTheBook;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getNameOfTheBook() {
        return nameOfTheBook;
    }

    public Author getAuthor() {
        return author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameOfTheBook='" + nameOfTheBook + '\'' +
                ", author=" + author.toString() +
                ", yearOfPublication=" + yearOfPublication +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return yearOfPublication == book.yearOfPublication && Objects.equals(nameOfTheBook, book.nameOfTheBook) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameOfTheBook, author, yearOfPublication);
    }
}
